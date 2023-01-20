//declaring the package
package com.util;

//iporting the packages
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.Employee;
import com.entity.Projects;

//declaring the class
public class GetConnection {

	private static SessionFactory sf;

	// connection method with sessionfactory as return type
	public static SessionFactory con() {

		// configuration
		Configuration cfg = new Configuration();

		// setting the properties
		Properties prop = new Properties();
		prop.put(Environment.USER, "root");
		prop.put(Environment.PASS, "Kmohan@180");
		prop.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
		prop.put(Environment.HBM2DDL_AUTO, "update");
		prop.put(Environment.SHOW_SQL, true);
		prop.put(Environment.FORMAT_SQL, true);

		cfg.setProperties(prop);
		// mapping the entity class
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Projects.class);

		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();

		sf = cfg.buildSessionFactory(sr);

		return sf;
	}
}