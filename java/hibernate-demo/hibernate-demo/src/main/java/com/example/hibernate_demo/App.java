 package com.example.hibernate_demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class App {
    public static void main( String[] args ) {
//    	CrewmateName cn = new CrewmateName();
//    	Pet p = new Pet();
//    	Crewmate cm = new Crewmate();
//		
//		cn.setFname("Amy");
//		cn.setMname("is not");
//		cn.setLname("sus");
//
//		p.setPid(1);
//		p.setKind("dog");
//		p.setCrewmate(cm);
//    	
//        cm.setId(101);
//        cm.setName(cn);
//        cm.setName("Bob");
//        cm.setColour("white");
//        cm.getPets().add(p);
    	
    	Crewmate cm1 = null;
        
        Configuration cfg = new Configuration().configure()
        		.addAnnotatedClass(Pet.class)
        		.addAnnotatedClass(Crewmate.class);
        
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        
        SessionFactory sf = cfg.buildSessionFactory(sr);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
//        session.persist(p);
//        session.persist(cm);
//        
//        tx.commit();
        
        cm1 = (Crewmate) session.get(Crewmate.class, 101);
        System.out.println(cm1);
        
        List<Pet> pets = cm1.getPets();
        
        for (Pet p1 : pets) {
        	System.out.println(p1);
        }
        
    }
}
