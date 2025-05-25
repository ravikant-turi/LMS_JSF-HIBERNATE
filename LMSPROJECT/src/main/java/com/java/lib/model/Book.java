package com.java.lib.model;

public class Book {

	private int id;

	private String name;

	private int totalBooks;
	
	private String dept;
	
	private String edition;
	
	private String author;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalBooks() {
		return totalBooks;
	}
	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int id, String name, int totalBooks, String dept, String edition, String author) {
	
		this.id = id;
		this.name = name;
		this.totalBooks = totalBooks;
		this.dept = dept;
		this.edition = edition;
		this.author = author;
	}
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", totalBooks=" + totalBooks + ", dept=" + dept + ", edition="
				+ edition + ", author=" + author + "]";
	}
	
	
	
	

}
