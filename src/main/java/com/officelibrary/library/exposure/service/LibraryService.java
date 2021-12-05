package com.officelibrary.library.exposure.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.officelibrary.library.exposure.model.Book;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class LibraryService {

    private List<Book> books;

    public LibraryService() {
        this.books = new ArrayList<>();
    }

    public List<Book> addBook(Book book) {
        this.books.add(book);
        return this.books;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public Optional<Book> getBookByTitle(String title) {
        return this.books.stream().filter(book -> book.getTitle().equals(title)).findAny();
    }

    public List<Book> deleteBook(Book book) {
        this.books.remove(book);
        return this.books;
    }
}