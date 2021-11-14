package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBooksWithConditionsReturnList(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4,theListOfBooks.size());

    }
    @Test
    void testListBooksWithConditionMoreThan20(){
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);
        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }
    @Test
    void testListBooksWithConditionFragmentShorterThan3(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> theListOfBook10 = bookLibrary.listBooksWithCondition("An");
        //Then
        assertEquals(0,theListOfBook10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    void testListBooksInHandsOfRented0(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("Adam","Surname","8754665456");
        List<Book> emptyList = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(emptyList);
        //When
        List<Book> testList = bookLibrary.listBooksInHandsOf(user);
        //Then
        assertEquals(0,testList.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);
    }
    @Test
    void testListBooksInHandsOfRented1(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("Adam","Surname","8754665456");
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Title", "Author", 1999));
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOfBooks);
        //When
        List<Book> testList = bookLibrary.listBooksInHandsOf(user);
        //Then
        assertEquals(1,testList.size());
        verify(libraryDatabaseMock, times(1)).listBooksInHandsOf(user);

    }
    @Test
    void testListBooksInHandsOfRented5(){
        //Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser user = new LibraryUser("Adam","Surname","8754665456");
        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Title", "Author", 1999));
        listOfBooks.add(new Book("Title2","Author2",2000));
        listOfBooks.add(new Book("Title3","Author3",2000));
        listOfBooks.add(new Book("Title4","Author4",2000));
        listOfBooks.add(new Book("Title5","Author5",2000));
        when(libraryDatabaseMock.listBooksInHandsOf(user)).thenReturn(listOfBooks);
        //When
        List<Book> testList = bookLibrary.listBooksInHandsOf(user);
        //Then
        assertEquals(5,testList.size());
        verify(libraryDatabaseMock,times(1)).listBooksInHandsOf(user);
    }


}
