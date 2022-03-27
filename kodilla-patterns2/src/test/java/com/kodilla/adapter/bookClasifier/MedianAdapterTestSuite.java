package com.kodilla.adapter.bookClasifier;

import com.kodilla.adapter.bookClasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
       //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book(
                "Title1","Test1",2000,"AJDGDY87546"));
        bookSet.add(new Book(
                "Test2","Test2",2001,"HDOMBX678"));
        bookSet.add(new Book(
                "Test3","Test3",2002,"NHDUMNBA000"));
        bookSet.add(new Book(
                "Test4","Test4",2003,"LOKNBH009"));
        bookSet.add(new Book(
                "Test4","Test4",2003,"RTCWR234"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int mediana = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2002,mediana);
    }
}
