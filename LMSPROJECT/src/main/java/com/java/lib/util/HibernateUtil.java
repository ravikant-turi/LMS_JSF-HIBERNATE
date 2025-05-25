package com.java.lib.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateUtil {
	
	public static final SessionFactory SESSION_FACTORY;
	
	static {
		SESSION_FACTORY=new AnnotationConfiguration().configure().buildSessionFactory();
		
		
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
	
	

}
