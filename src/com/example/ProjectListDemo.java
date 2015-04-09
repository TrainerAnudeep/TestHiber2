package com.example;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
public class ProjectListDemo {

	public static void main(String args[]){
		Data.prepareData();
		 Session session = HibernateSessionFactory.getSession();
			
	        Criteria crit = session.createCriteria(Product.class);
	        ProjectionList projList = Projections.projectionList();
	        projList.add(Projections.property("name"));
	        projList.add(Projections.groupProperty("name"));

	        crit.setProjection(projList);
	        List results = crit.list();
	        displayObjectsList(results);
			
	}
	static public void displayObjectsList(List list)
    {
        Iterator iter = list.iterator();
        if (!iter.hasNext())
        {
            System.out.println("No objects to display.");
            return;
        }
        while (iter.hasNext())
        {
            System.out.println("New object");
            Object[] obj = (Object[]) iter.next();
            for (int i=0;i<obj.length;i++)
            {
                System.out.println(obj[i]);
            }
            
            
        }
    }    
}
