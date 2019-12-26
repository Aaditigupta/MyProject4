package com.mindtree.authorbook.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Author {
	@Id
	private int authorId;
	private String authorName;
	@OneToMany(mappedBy = "author", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private List<Book> books;

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(int authorId, String authorName, List<Book> books) {
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
	@JsonIgnore
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
