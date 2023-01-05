package com.studentDAO;

import com.entity.Student;

public interface Services {

	public void addStudent(Student st);

	public void deleteStudent(int roll);

	public void getStudent(int id);

	public void updateStudent(int in);

}
