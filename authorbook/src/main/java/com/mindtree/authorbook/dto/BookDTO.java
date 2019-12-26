package com.mindtree.authorbook.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BookDTO {
	private int bookId ;
	private String bookName;
	private int bookPrice;
	 private AuthorDTO author;
	 private PublisherDTO publisher;
	public BookDTO() {
		// TODO Auto-generated constructor stub
	}
	public BookDTO(int bookId, String bookName, int bookPrice, AuthorDTO author, PublisherDTO publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;
		this.publisher = publisher;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public AuthorDTO getAuthor() {
		return author;
	}
	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	public PublisherDTO getPublisher() {
		return publisher;
	}
	public void setPublisher(PublisherDTO publisher) {
		this.publisher = publisher;
	}
	 
}
