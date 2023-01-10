package com.bookreader.beans;

public class Book {
    private int bookId;
    private String title;
    private String details;
    private int totalPages;

    public Book(int bookId, String title, String details, int totalPages) {
        this.bookId = bookId;
        this.title = title;
        this.details = details;
        this.totalPages = totalPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
    
}
