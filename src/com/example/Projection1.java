package com.example;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import org.hibernate.criterion.Projections;
public class Projection1 {

	public static void main(String args[]){
		Data.prepareData();
		 Session session = HibernateSessionFactory.getSession();
		   Criteria crit = session.createCriteria(Product.class);
	        crit.setProjection(Projections.rowCount());
	   System.out.println(     crit.uniqueResult());
	       /* List results = crit.list();
	        displayObjectList(results);
			*/
	}
	   static public void displayObjectList(List list)
	    {
	        Iterator iter = list.iterator();
	        if (!iter.hasNext())
	        {
	            System.out.println("No objects to display.");
	            return;
	        }
	        while (iter.hasNext())
	        {
	            Object obj = iter.next();
	            
	            System.out.println(obj);
	        }
	    }
    }    

