package com.test;

import com.studentDAO.Services;
import com.studentDAOimp.ServiceImp;

public class App {
	public static void main(String[] args) {

		Services se = new ServiceImp();

		// object to add details
//		Student st = new Student();
//		st.setRoll_no(2);
//		st.setStd_name("Mohan");
//		st.setCourse("Java");
//		st.setContact_no(911012346);
//		st.setMarks(98);
//		se.addStudent(st);

		// constructor to add another row
//		Student st1 = new Student(2, "Rohan", "c++", 87678747, 97);
//		se.addStudent(st1);

		// calling the method to delete a perticular row
//		se.deleteStudent(2);

		// calling method to get a perticular row
//		se.getStudent(1);

		// calling the method to update the details
		se.updateStudent(2);

	}
}
