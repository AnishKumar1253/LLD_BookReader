package com.bookreader.main;

import com.bookreader.beans.Book;
import com.bookreader.beans.User;
import com.bookreader.dashboard.Dashboard;
import com.bookreader.system.OnlineReaderSystem;

public class Test {
    public static void main(String[] args) {
        OnlineReaderSystem onlineReader = new OnlineReaderSystem();

        Book book = new Book(1, "title1", "details1", 200);
        User user = new User(1, "username1");
        
        User user2 = new User(2, "username2");
        onlineReader.getUserManager().addUser(user2);


        //Add book and user to the system
        onlineReader.setBook(book);
        onlineReader.setUser(user);

        Dashboard display = onlineReader.getDisplay();
        //Navigating to next and previous pages
        display.nextPage();
        display.refreshPage();
        display.previousPage();

        //Displaying the current user and book information
        display.displayUserInfo();
        display.displayBookInfo();


    }
}
