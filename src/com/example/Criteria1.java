package com.example;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Criteria1 {

	public static void main(String args[]) {
		Data.prepareData();
		Session session = HibernateSessionFactory.getSession();

		Criteria crit = session.createCriteria(Supplier.class);
		Criteria prdCrit = crit.createCriteria("products");
		prdCrit.add(Restrictions.gt("price", new Double(22.0)));
		List results = crit.list();
		displaySupplierList(results);

		session.close();

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
