package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	public Optional<Book> getBookById(int id) {
		return bookRepository.findById(id);
	}
}
