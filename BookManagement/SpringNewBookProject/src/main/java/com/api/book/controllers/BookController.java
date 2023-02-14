package com.api.book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.Entities.Book;
import com.api.book.services.BookService;
@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	
	
	@GetMapping("/books")

	
	public List<Book> getBooks() {
		return this.bookService.getAllBook();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id")int id)
	{
	return bookService.getBookById(id);
  }
	
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
	 this.bookService.addBook(book);
	 System.out.println(book);
	 return book;
	}
	
	// delete book handler 
	@DeleteMapping("/books/{bookId}")
	public void deleteBook(@PathVariable("bookId") int bookId) {
		this.bookService.deleteBook(bookId);
	}
	
	// update book handler
	@PutMapping("/books/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
		this.bookService.updateBook(book,bookId);
	return book;
	}
}