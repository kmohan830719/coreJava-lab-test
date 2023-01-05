package com.hiberUtil;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.Student;

public class GetConnection {

	public static SessionFactory sf;

	public static SessionFactory con() {

		Configuration cfg = new Configuration();

		Properties prop = new Properties();
		prop.put(Environment.USER, "root");
		prop.put(Environment.PASS, "Kmohan@180");
		prop.put(Environment.URL, "jdbc:mysql://localhost:3306/studentinfo");
		prop.put(Environment.HBM2DDL_AUTO, "update");
		prop.put(Environment.SHOW_SQL, true);
		prop.put(Environment.FORMAT_SQL, true);

		cfg.setProperties(prop);
		cfg.addAnnotatedClass(Student.class);

		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

		sf = cfg.buildSessionFactory(sr);

		return sf;
	}
}
