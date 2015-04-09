package com.example;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProjectDemo1 {
	public static void main(String[] args) {
		
		Data.prepareData();

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Product p = null;
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        p = (Product)session.createQuery("from Product where name='Product 1'").uniqueResult();
        tx.commit();

        System.out.println("Username of p acquired from DB... " + p.getName());
        System.out.println("Begin transaction:");
        tx = session.beginTransaction();
        System.out.println("Change name of p");
        p.setName("quentin");
        System.out.println("Username of p before rollback... " + p.getName());
        tx.rollback();
        System.out.println("Username of p after rollback... " + p.getName());

        tx = session.beginTransaction();
        System.out.println("About to refresh p!");
        session.refresh(p);
        System.out.println("Username of p after refresh... " + p.getName());
        tx.commit();
        System.out.println("Username of p after commit... " + p.getName());
		
     

	}
    static public void displaySupplierList(List list) {
        Iterator iter = list.iterator();
        if (!iter.hasNext()) {
            System.out.println("No suppliers to display.");
            return;
        }        
        while (iter.hasNext()) {
            Supplier supplier = (Supplier) iter.next();
            String msg = supplier.getName();
            System.out.println(msg);
        }
    }

 



}
