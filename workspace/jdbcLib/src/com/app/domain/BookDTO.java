package com.app.domain;

public class BookDTO {

//	CREATE TABLE TBL_BOOK(
//			   book_number NUMBER,
//			   book_title varchar2(100) NOT NULL,
//			   book_author varchar2(100) NOT NULL,
//			   CONSTRAINT pk_book PRIMARY KEY(book_number)
//			);

	private int bookNumber;
	private String bookTitle;
	private String bookAuthor;

	public BookDTO() {
	}

	// getter, setter
	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	// toString
	@Override
	public String toString() {
		return "BookDTO [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + "]";
	}

}
