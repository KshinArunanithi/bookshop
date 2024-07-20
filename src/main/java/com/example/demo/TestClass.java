package com.example.demo;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Optional;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestClass {	

	@Autowired
	private BookService bookService;

	@Test
	public void testRetrieveAllBooks() {

		List<Book> books = bookService.getAllBooks();

		assertEquals(1, books.size());
	}

	@Test
	public void testRetrieveBookById() {

		Optional<Book> book = bookService.getBookById(1);

		assertEquals(1, book.get());
	}
}
