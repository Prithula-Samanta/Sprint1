package com.api.book.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bood_id")
	private int id;
	
	private String title;
//	private String Author;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Author author;
	public Book(int id, String title, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.author=author;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
}
