package com.java.lib.controller;

import java.util.List;

import com.java.lib.Dao.BooksDao;
import com.java.lib.daoimpl.BookDaoImpl;
import com.java.lib.model.Book;

public class BookController {
	
	BooksDao bookdao=new BookDaoImpl();
	
	public String addBookDaoController(Book book) {
		
		return bookdao.addBooksDao(book);
	}
	
	public List<Book> showAllBookDaoController(){
		return bookdao.showAllBookDao();
	}
	
	public Book searchBookById(int bookId) {
		
		
		if(bookdao.searchBookByIdDao(bookId)!=null) {
			return bookdao.searchBookByIdDao(bookId);
		}
		
		return null;
	}
	
	public String deleteBookByIdController(int bookId) {
		
		return bookdao.deleteBookDao(bookId);
		
	}

}
