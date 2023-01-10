package com.bookreader.system;

import com.bookreader.beans.Book;
import com.bookreader.beans.User;
import com.bookreader.dashboard.Dashboard;
import com.bookreader.utils.Library;
import com.bookreader.utils.UserManager;

public class OnlineReaderSystem {
    private Library library;
    private UserManager userManager;
    private Dashboard display;

    public OnlineReaderSystem() {
        library = new Library();
        userManager = new UserManager();
        display = new Dashboard();
    }

    public Book getBook(int bookId) {
        return library.findBook(bookId);
    }

    public User getUser(int userId) {
        return userManager.findUser(userId);
    }

    public void setBook(Book book) {
        display.setBook(book);
    }

    public void setUser(User user) {
        display.setUser(user);
    }
    
    public Dashboard getDisplay() {
        return display;
    }
    public UserManager getUserManager() {
        return userManager;
    }

}

