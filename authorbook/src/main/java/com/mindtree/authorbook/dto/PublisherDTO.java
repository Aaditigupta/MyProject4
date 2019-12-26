package com.mindtree.authorbook.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PublisherDTO {
	private int publisherId;
	private String publisherName;
	private String publisherLOGO;
	 private List<BookDTO> books;
	public PublisherDTO() {
		// TODO Auto-generated constructor stub
	}
	public PublisherDTO(int publisherId, String publisherName, String publisherLOGO, List<BookDTO> books) {
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
	public List<BookDTO> getBooks() {
		return books;
	}
	public void setBooks(List<BookDTO> books) {
		this.books = books;
	}
	 
}
