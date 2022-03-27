package com.kodilla.adapter.bookClasifier;

import com.kodilla.adapter.bookClasifier.librarya.Book;
import com.kodilla.adapter.bookClasifier.librarya.Classifier;
import com.kodilla.adapter.bookClasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.adapter.bookClasifier.libraryb.Book> result = new HashMap<>();
        for(Book book: bookSet){
            com.kodilla.adapter.bookClasifier.libraryb.Book book2 = new com.kodilla.adapter.bookClasifier.libraryb.Book(
                    book.getAuthor(),
                    book.getTitle(), book.getPublicationYear()
            );
            result.put(new BookSignature(book.getSignature()),book2);
        }
        return medianPublicationYear(result);
    }
}
