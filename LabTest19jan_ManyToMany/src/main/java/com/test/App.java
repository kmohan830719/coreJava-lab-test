//declaring the package
package com.test;

//importing the packages
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.entity.Projects;
import com.util.GetConnection;

//declaring the class
public class App {
	// main method
	public static void main(String[] args) {

		// calling the connection method
		SessionFactory sf = GetConnection.con();
		System.out.println(sf);

		// opening the sesion
		Session s = sf.openSession();
		// begining the ttransaction
		Transaction tr = s.beginTransaction();

		// creating object of the enity employee
		Employee e = new Employee();
		Employee e2 = new Employee();

		e.setEmp_id(101);
		e.setEmp_name("Mohan");

		e2.setEmp_id(102);
		e2.setEmp_name("K Mohan");

		// creating the object of the entity projects
		Projects pr = new Projects();
		Projects pr2 = new Projects();

		pr.setProject_id(201);
		pr.setProject_name("E-commerce");

		pr2.setProject_id(202);
		pr2.setProject_name("Library management system");

		List<Employee> list1 = new ArrayList<>();
		List<Projects> list2 = new ArrayList<>();

		list1.add(e);
		list1.add(e2);

		list2.add(pr);
		list2.add(pr2);

		e.setProjects(list2);
		pr2.setEmployee(list1);

		// saving the data
		s.save(e);
		s.save(e2);
		s.save(pr);
		s.save(pr2);
		tr.commit();
		System.out.println("Data Saved........");

	}
}
