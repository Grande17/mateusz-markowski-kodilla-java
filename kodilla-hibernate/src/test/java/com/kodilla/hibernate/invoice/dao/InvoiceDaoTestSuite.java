package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("01/01/2022");

        Product product1 = new Product("Hammer");
        Product product2 = new Product("Screwer");
        Product product3 = new Product("Nail");

        Item hammer = new Item(product1,new BigDecimal(15),15,new BigDecimal(9));
        Item screwer = new Item(product2,new BigDecimal(10), 25,new BigDecimal(6));
        Item nail = new Item(product3,new BigDecimal(6),500,new BigDecimal(3));

        hammer.setInvoice(invoice);
        screwer.setInvoice(invoice);
        nail.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(hammer);
        items.add(screwer);
        items.add(nail);

        invoice.setItems(items);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        Optional<Invoice> getInfo = invoiceDao.findById(id);
        //Then
        Assert.assertEquals(id,getInfo.get().getId());


        //CleanUp
        invoiceDao.deleteById(id);
    }
}
