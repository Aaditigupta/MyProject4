 package com.mindtree.authorbook.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {
	@Id
	private int bookId ;
	private String bookName;
	private int bookPrice;
    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private Author author;
    @OneToOne(cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private Publisher publisher;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName, int bookPrice, Author author, Publisher publisher) {
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
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
     
}
