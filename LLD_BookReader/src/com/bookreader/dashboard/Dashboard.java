package com.bookreader.dashboard;

import com.bookreader.beans.Book;
import com.bookreader.beans.User;

public class Dashboard {
    private Book book;
    private User user;
    private int bookPageNumber;

    public void initialize(Book book, User user) {
        this.book = book;
        this.user = user;
        bookPageNumber = 1;
    }

    public int nextPage() {
        if(bookPageNumber < book.getTotalPages()) {
            return ++bookPageNumber;
        }
        return bookPageNumber;
    }

    public int previousPage() {
        if(bookPageNumber > 1) {
            return --bookPageNumber;
        }
        return bookPageNumber;
    }

    public void refreshPage() {
        System.out.println("Displaying page number: " + bookPageNumber);
    }

    public void displayUserInfo() {
        System.out.println("User: " + user.getName());
    }

    public void displayBookInfo() {
        System.out.println("Book: " + book.getTitle());
    }
    
    public void setBook(Book book) {
        if(this.book == null)
            this.book = book;
    }

    public void setUser(User user) {
        if(this.user == null)
            this.user = user;
    }
}

