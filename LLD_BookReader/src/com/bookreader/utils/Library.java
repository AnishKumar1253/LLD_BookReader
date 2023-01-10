package com.bookreader.utils;
import java.util.HashMap;

import com.bookreader.beans.Book;

public class Library {
    private HashMap<Integer, Book> books;

    public Library() {
        books = new HashMap<Integer, Book>();
    }

    public boolean addBook(Book book) {
        int bookId = book.getBookId();
        if(!books.containsKey(bookId)) {
            books.put(bookId, book);
            return true;
        }
        return false;
    }

    public boolean removeBook(int bookId) {
        if(books.containsKey(bookId)) {
            books.remove(bookId);
            return true;
        }
        return false;
    }

    public Book findBook(int bookId) {
        return books.get(bookId);
    }
}

