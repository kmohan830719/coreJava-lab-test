package com.studentDAOimp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Student;
import com.hiberUtil.GetConnection;
import com.studentDAO.Services;

public class ServiceImp implements Services {

	SessionFactory sf = GetConnection.con();
	Session s = sf.openSession();
	Transaction tr = s.beginTransaction();

	public void addStudent(Student st) {
		s.save(st);
		tr.commit();
		System.out.println("Data Saved.....");
	}

	public void deleteStudent(int roll) {
		Student d = s.load(Student.class, roll);
		s.delete(d);
		tr.commit();
		System.out.println("Data deleted.....");
	}

	public void getStudent(int roll) {
		Student st = s.get(Student.class, roll);
		System.out.println(st);
	}

	public void updateStudent(int roll) {
		Student st = s.load(Student.class, roll);
		st.setStd_name("K Mohan");
		st.setContact_no(91123456);
		st.setMarks(97);
		s.save(st);
		tr.commit();
		System.out.println("The Data updated");
	}

}
