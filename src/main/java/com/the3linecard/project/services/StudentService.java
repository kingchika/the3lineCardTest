package com.the3linecard.project.services;

import com.the3linecard.project.entities.Student;


public interface StudentService {
	public void addNewStudent(Student st);
	public void updateStudentData(Student std);
	public void deleteStudent(Long id);
	
	public Student fetchStudent(String name);
	

}
