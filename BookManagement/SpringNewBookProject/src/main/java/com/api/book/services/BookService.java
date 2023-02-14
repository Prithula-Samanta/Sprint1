package com.api.book.services;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.Entities.Book;
import com.api.book.dao.BookRepository;
@Component
public class BookService {
	@Autowired
	private BookRepository bookRepository;  
//  private static List<Book> list = new  ArrayList<>();
  
//  static {
//	  list.add(new Book(12,"Java Complete Reference ","xyz"));
//	  list.add(new Book(36,"Head First to java","ABC"));
//	  list.add(new Book(45,"Python by Devid","BCD"));
//  }
	
//  get all books 
  public List<Book> getAllBook(){
	  List<Book> list =(List<Book>)this.bookRepository.findAll();
	  return list;
  }
	
////  get all books 
//  public List<Book> getAllBook(){
//	  return list;
//  }

  public Book getBookById(int id) {
	  Book book=null;
	  book=this.bookRepository.findById(id);
	  return book;
  }
  
  
  // get single book by id
//  public Book getBookById(int id) {
//	  Book book=null;
//	  book=list.stream().filter(e->e.getId()==id).findFirst().get();
//	  return book;
//  }
  // adding the book
  
  public Book addBook(Book b) {
Book result=bookRepository.save(b);
	  return result;
  }
  
//  
//  public Book addBook(Book b) {
//	  list.add(b);
//	  return b;
//  }
  // delete book 
  
public void deleteBook(int bid) {
  bookRepository.deleteById(bid);
}
//  public void deleteBook(int bid) {
//	  list.stream().filter(book->{
//		  if(book.getId()!=bid) {
//			  return true;
//		  }
//		  else {
//			  return false;
//		  }
//	  }).collect(Collectors.toList());
//  }


public void updateBook(Book book, int bookId) {
	// TODO Auto-generated method stub
	book.setId(bookId);
	bookRepository.save(book);
}

//public void updateBook(Book book, int bookId) {
//	// TODO Auto-generated method stub
//	
//	   list.stream().map(b->{
//		   if(b.getId()==bookId){
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//		 return b;  
//	
//	   }).collect(Collectors.toList());
//}

}
