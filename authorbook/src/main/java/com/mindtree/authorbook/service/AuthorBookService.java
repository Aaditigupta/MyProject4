package com.mindtree.authorbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.authorbook.dto.AuthorDTO;
import com.mindtree.authorbook.dto.BookDTO;
import com.mindtree.authorbook.dto.PublisherDTO;
import com.mindtree.authorbook.entity.Author;
import com.mindtree.authorbook.entity.Book;
import com.mindtree.authorbook.entity.Publisher;
import com.mindtree.authorbook.repository.AuthorRepository;
import com.mindtree.authorbook.repository.BookRepository;
import com.mindtree.authorbook.repository.PublisherRepository;

@Service
public class AuthorBookService {

	@Autowired
	BookRepository bookrepo;

	@Autowired
	AuthorRepository authorrepo;

	@Autowired
	PublisherRepository pubrepo;

	public String sendDetails(BookDTO book) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		book1.setBookId(book.getBookId());
		book1.setBookName(book.getBookName());
		book1.setBookPrice(book.getBookPrice());

		AuthorDTO authordto = book.getAuthor();
		Author author = new Author();
		author.setAuthorId(authordto.getAuthorId());
		author.setAuthorName(authordto.getAuthorName());
		authorrepo.save(author);
		book1.setAuthor(author);

		PublisherDTO publisherdto = book.getPublisher();
		Publisher publisher = new Publisher();
		publisher.setPublisherId(publisherdto.getPublisherId());
		publisher.setPublisherName(publisherdto.getPublisherName());
		publisher.setPublisherLOGO(publisherdto.getPublisherLOGO());
		pubrepo.save(publisher);
		book1.setPublisher(publisher);

		bookrepo.save(book1);
		return "Inserted Successfully";
	}

	public List<BookDTO> getAllBooks(int id) {
		// TODO Auto-generated method stub
		List<BookDTO> booksdto = new ArrayList<>();
		BookDTO bookdto = new BookDTO();
		Author author = authorrepo.getOne(id);
		if (id == author.getAuthorId()) {
			for (Book book : author.getBooks()) {
				bookdto.setBookId(book.getBookId());
				bookdto.setBookName(book.getBookName());
				bookdto.setBookPrice(book.getBookPrice());
				booksdto.add(bookdto);
			}
		}
		System.out.println("hello:Aditi");
		return booksdto;
	}

}
