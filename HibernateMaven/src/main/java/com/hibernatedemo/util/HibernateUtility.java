package com.hibernatedemo.util;

import java.util.HashMap;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import com.hibernatedemo.model.AdharCard;
import com.hibernatedemo.model.Person;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtility {
	
	public static StandardServiceRegistry registry;
	public static SessionFactory sessionFactory;
	

	
	public static SessionFactory getSessionfactFactory()
	{
		if(sessionFactory == null)
		{
			Map<Object,String> settings=new HashMap<Object,String>();
			settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			settings.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernateDb");
			settings.put(Environment.USER,"root");
			settings.put(Environment.PASS,"root");
			settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
			settings.put(Environment.HBM2DDL_AUTO,"update");
			settings.put(Environment.SHOW_SQL,"true");
			
			registry=new StandardServiceRegistryBuilder().applySettings(settings).build();
			MetadataSources mds=new MetadataSources(registry).addAnnotatedClass(Person.class).addAnnotatedClass(AdharCard.class);
			Metadata md=mds.getMetadataBuilder().build();
			sessionFactory=md.getSessionFactoryBuilder().build();
			System.out.println("hibernate file executtesd");
			
		}
		
		return sessionFactory;
	}

}
