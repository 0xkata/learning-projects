package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		// create configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Song.class);

		// create session factory
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		// initialize session object
		Session session = sessionFactory.openSession();

		Song song1 = new Song();
		song1.setId(1);
		song1.setName("Betelugese");
		song1.setArtist("Yuuri");

		session.beginTransaction();
		session.persist(song1);
		session.getTransaction().commit();

		System.out.println("Success. Check Database.");

	}

}
