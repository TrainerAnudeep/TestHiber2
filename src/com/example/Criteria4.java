package com.example;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
public class Criteria4 {
	public static void main(String args[]){
		Data.prepareData();
		Session session = HibernateSessionFactory.getSession();
		
		Criteria crit = session.createCriteria(Product.class);
       crit.addOrder(Order.asc("price"));
        List results = crit.list();
        displayProductsList(results);

	}
   public static void displayProductsList(List list){
        Iterator iter = list.iterator();
        if (!iter.hasNext()){
            System.out.println("No products to display.");
            return;
        }
        while (iter.hasNext()){
            Product product = (Product) iter.next();
            //String msg = product.getSupplier().getName() + "\t";
          String  msg = product.getName() + "\t";
            msg += product.getPrice() + "\t";
            msg += product.getDescription();
            System.out.println(msg);
        }
    }

	}


