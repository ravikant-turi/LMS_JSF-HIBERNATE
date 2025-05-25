package com.java.lib.Dao;

import java.util.List;

import com.java.lib.model.Book;

public interface BooksDao {

	String addBooksDao(Book book);
	
	List<Book> showAllBookDao();
	
	Book searchBookByIdDao(int bookId);
	
	
	String updateBookDao(Book book);
	
	
	String deleteBookDao(int bookId);
	
	
	

}
