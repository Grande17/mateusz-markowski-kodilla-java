package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library implements Cloneable {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }
    public void setName(String name1){
        this.name = name1;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
    public boolean addBook(Book book){
        return books.add(book);
    }
    public void setBooks(Set<Book>books){
        this.books = books;
    }
    public boolean removeBook(Book book){
        return books.remove(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}'+"\n";
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();

        clonedLibrary.setBooks(new HashSet<>());

        for (Book book: getBooks()){
            clonedLibrary.addBook(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        }
        return clonedLibrary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Library library = (Library) o;

        if (!name.equals(library.name)) return false;
        return books.equals(library.books);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + books.hashCode();
        return result;
    }
}
