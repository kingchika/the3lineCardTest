package com.the3linecard.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.the3linecard.project.entities.Student;
import com.the3linecard.project.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	StudentRepository studentRepo;

	@Override
	public void addNewStudent(Student st) {
		studentRepo.save(st);
	}

	@Override
	public void updateStudentData(Student student) {
		studentRepo.updateAgeAndClass(student.getId(), student.getStudentClass(), student.getAge());
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
	}

	@Override
	public Student fetchStudent(String name) {
		return studentRepo.findByName(name);
	}

}
