package com.java.lib.main;

import java.util.Scanner;

import com.java.lib.controller.BookController;
import com.java.lib.model.Book;

public class Main {

	public static void main(String[] args) {

		BookController bookcontroller = new BookController();

//		createBook(bookcontroller);

		showAllBook(bookcontroller);

//		searchBookMain(bookcontroller);
		
//		deletBookMain(bookcontroller);
//		
//		deletBookMain(bookcontroller);
//		
//		deletBookMain(bookcontroller);

	}

	public static void createBook(BookController bookcontroller) {
		Book book = new Book();

		book.setAuthor("author3");

		book.setDept("dept3");

		book.setEdition("edition3");

//		book.setId(1);

		book.setName("name3");

		book.setTotalBooks(3);

		bookcontroller.addBookDaoController(book);
	}

	public static void showAllBook(BookController bookcontroller) {

		bookcontroller.showAllBookDaoController().forEach(System.out::println);

	}

	public static void searchBookMain(BookController bookcontroller) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the book id");

		int bookid = sc.nextInt();

		Book book = bookcontroller.searchBookById(bookid);

		System.out.println(book.getAuthor());
		System.out.println(book.getName());
		System.out.println(book.getTotalBooks());

	}

	public static void updateBookMain(BookController bookcontroller) {

		Book book = new Book();

		book.setAuthor("author3");

		book.setDept("dept3");

		book.setEdition("edition3");

//		book.setId(1);

		book.setName("name3");

		book.setTotalBooks(3);

		bookcontroller.addBookDaoController(book);
	}

	public static void deletBookMain(BookController bookcontroller) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the book id");

		int bookid = sc.nextInt();

		bookcontroller.deleteBookByIdController(bookid);
	}

}
