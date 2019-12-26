package com.mindtree.authorbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.authorbook.dto.BookDTO;
import com.mindtree.authorbook.service.AuthorBookService;

@RestController
public class AuthorBookController {

	@Autowired
	AuthorBookService service;

	@PostMapping("/postDetails") 
	public String postData(@RequestBody BookDTO book) {
		String isSent=service.sendDetails(book);
		return isSent;
	}
	
	@GetMapping("/getDetails/{id}")
	public List<BookDTO> getBooks(@PathVariable int id){
		List<BookDTO> isGet=service.getAllBooks(id);
		
		return isGet;
	}
}
