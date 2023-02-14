package com.api.book.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int authorId;
	@Column(name = "first_name")
   private String firstName;
   private String lastName;
   private String language;

//@OneToOne(mappedBy = "author")
//	private Book book;

//public Book getBook() {
//	return book;
//}
//public void setBook(Book book) {
//	this.book = book;
//}
public int getAuthorId() {
	return authorId;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getLanguage() {
	return language;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setLanguage(String language) {
	this.language = language;
}

public Author(int authorId, String firstName, String lastName, String language) {
	super();
	this.authorId = authorId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.language = language;
//	this.book = book;
}
public Author() {
	
	super();
	// TODO Auto-generated constructor stub
}

   
}
