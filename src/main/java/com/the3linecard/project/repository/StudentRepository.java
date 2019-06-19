package com.the3linecard.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

import com.the3linecard.project.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	@Transactional
	@Modifying
	@Query("UPDATE Student s SET s.studentClass = ?2, s.age = ?3 WHERE s.id = ?1")
	public void updateAgeAndClass(Long id, String stdClass, int age);
	
	public Student findByName(String name);
}
