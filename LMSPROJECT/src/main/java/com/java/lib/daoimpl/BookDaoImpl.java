package com.java.lib.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.lib.Dao.BooksDao;
import com.java.lib.model.Book;
import com.java.lib.util.HibernateUtil;

public class BookDaoImpl implements BooksDao {

	SessionFactory sessionFactory;
	Session session;

	@Override
	public String addBooksDao(Book book) {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction tans = session.beginTransaction();

		session.save(book);

		tans.commit();
		session.close();

		return "book is added";

	}

	@Override
	public List<Book> showAllBookDao() {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction tans = session.beginTransaction();

		Query query = session.createQuery("from Book");

		List<Book> bookList = query.list();

		tans.commit();
		session.close();

		return bookList;
	}

	@Override
	public Book searchBookByIdDao(int bookId) {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();

		Book book = (Book) session.get(Book.class, bookId);

		trans.commit();

		session.close();

		return book;
	}

	@Override
	public String updateBookDao(Book book) {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();
		Book foundBook = (Book) session.get(Book.class, book.getId());

		if (foundBook == null) {
			return "book is not exist with this is bookId : "+ book.getId();
		}
		
		session.update(book);
		
		trans.commit();
		
		session.close();
		
		
		
		return "book is updated";

	}

	@Override
	public String deleteBookDao(int bookId) {

		sessionFactory = HibernateUtil.getSessionFactory();

		session = sessionFactory.openSession();

		Transaction trans = session.beginTransaction();

		Book book = (Book) session.get(Book.class, bookId);

		if (book == null) {
			return "book is not exist with this is bookId : " + bookId;
		}

		session.delete(book);

		trans.commit();

		session.close();

		return "book is deleted Sucussfully";
	}

}
