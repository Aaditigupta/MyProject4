package com.mindtree.authorbook.dto;

import java.util.List;

public class AuthorDTO {
	private int authorId;
	private String authorName;
	
	  private List<BookDTO> books;
	public AuthorDTO() {
		// TODO Auto-generated constructor stub
	}
	public AuthorDTO(int authorId, String authorName, List<BookDTO> books) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.books = books;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public List<BookDTO> getBooks() {
		return books;
	}
	public void setBooks(List<BookDTO> books) {
		this.books = books;
	}
	  
}
