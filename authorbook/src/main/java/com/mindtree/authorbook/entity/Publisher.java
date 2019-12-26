package com.mindtree.authorbook.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.authorbook.dto.BookDTO;

@Entity
public class Publisher {
	@Id
	private int publisherId;
	private String publisherName;
	private String publisherLOGO;
    @OneToMany(mappedBy="publisher",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private List<Book> books;
	public Publisher() {
		// TODO Auto-generated constructor stub
	}
	public Publisher(int publisherId, String publisherName, String publisherLOGO, List<Book> books) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherLOGO = publisherLOGO;
		this.books = books;
	}
	public int getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherLOGO() {
		return publisherLOGO;
	}
	public void setPublisherLOGO(String publisherLOGO) {
		this.publisherLOGO = publisherLOGO;
	}
	@JsonIgnore
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
    
}
