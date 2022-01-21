package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){
        //Given
        Library library = new Library("Library");
        Book book1 = new Book("Title1","Author1", LocalDate.now());
        Book book2 = new Book("Title2","Author2", LocalDate.now());
        Book book3 = new Book("Title3","Author3", LocalDate.now());
        Book book4 = new Book("Title4","Author4", LocalDate.now());
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Library shallowClone = null;
        try{
            shallowClone = library.shallowCopy();
            shallowClone.setName("Library Shallow Clone Prototype");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClone = null;
        try{
            deepClone = library.deepCopy();
            deepClone.setName("Library Deep Clone Prototype");
        }catch (CloneNotSupportedException c) {
            System.out.println(c);
        }
        //When
        library.removeBook(book3);
        //Then
        System.out.println(library);
        System.out.println(shallowClone);
        System.out.println(deepClone);
        assertEquals(3,library.getBooks().size());
        assertEquals(3,shallowClone.getBooks().size());
        assertEquals(4,deepClone.getBooks().size());





    }
}
