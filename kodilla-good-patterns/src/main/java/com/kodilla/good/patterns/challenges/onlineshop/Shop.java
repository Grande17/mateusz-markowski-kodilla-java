package com.kodilla.good.patterns.challenges.onlineshop;

public class Shop {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.request();
        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ComputerOrderRepository(),new ComputerOrderService()
        );
        orderProcessor.process(orderRequest);

    }

}
