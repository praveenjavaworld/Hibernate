package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nt.entity.InsurancePolicy;

public class HibernateUtil {
	
	private static SessionFactory factory;
	
	static {
		Configuration cfg = null;
		try {
			//bootstrap hibernate
			cfg = new Configuration();
			//specify mapping file
			//cfg.addFile("src/main/java/com/nt/entity/InsurancePolicy.hbm.xml");
			//specify entity class
			cfg.addAnnotatedClass(InsurancePolicy.class);
			//build sessionFactory
			factory = cfg.buildSessionFactory();
		} catch (HibernateException he) {
			he.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}//static
	
	public static Session getSession() {
		Session session = null;
		if(factory!=null)
			session = factory.openSession();
		return session;
	}
	
	public static void closeSession(Session session) {
		if(session!=null)
			session.close();
	}
	
	public static void closeSessionFactory() {
		if(factory!=null) {
			factory.close();
		}
	}
 
}
