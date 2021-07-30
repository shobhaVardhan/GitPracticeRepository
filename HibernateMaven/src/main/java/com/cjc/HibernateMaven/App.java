package com.cjc.HibernateMaven;

import org.hibernate.Session;

import com.hibernatedemo.model.AdharCard;
import com.hibernatedemo.model.Person;
import com.hibernatedemo.util.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Session session=HibernateUtility.getSessionfactFactory().openSession();
		AdharCard adc=new AdharCard();
		adc.setUid(123456);
		adc.setAddress("Pune");
		
		Person p=new Person();
		p.setName("shobah");
		p.setPan("AGDBH7234H");
		p.setAbc(adc);

		session.save(p);
		session.beginTransaction().commit();
		session.close();
		System.out.println("success...");
		
		

    }
}
