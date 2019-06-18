package com.the3linecard.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.the3linecard.project.entities.ResponseData;
import com.the3linecard.project.entities.Student;
import com.the3linecard.project.services.StudentServiceImp;


@RestController
@RequestMapping("the3line/university/api.1.0/")
public class The3lineRestController {
	
	@Autowired
	StudentServiceImp studentService;
	
	@GetMapping("mssg")
	public String getMessage() {
		return "Welcome To 3Line Card";
	}
	
	@GetMapping(path= "student/{name}", produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseData fetchDetail(@PathVariable("name") String name) {
		ResponseData feedback = null;
		try {
			Student student = studentService.fetchStudent(name);
			feedback = new ResponseData(student,"successfully fetched");
		
		return feedback;
		}
		catch(Exception e) {
			feedback = new ResponseData(new Student(), "student with the name does not exist");
		return 	feedback;		
		}
	}

	@DeleteMapping(path="/delete/{id}")
	public String deleteStudent(@PathVariable("id")Long id) {
		try {
			studentService.deleteStudent(id);
		return "successfully deleted.";	
		}
		catch(Exception e) {
			return "could not delete the student. "+ e.getMessage();
		}
	}

	@PostMapping(path="/update",consumes= MediaType.APPLICATION_JSON_VALUE)
	public String updateStudentInfo(@RequestBody Student student) {
		
		 try {
			 studentService.updateStudentData(student);
		return "update successful.";	 
		 }
		 catch(Exception e) {
			 return "error updating "+e.getMessage();
		 }
	}

	@PostMapping(path="/new/student", consumes= MediaType.APPLICATION_JSON_VALUE)
	public String createStudent(@RequestBody Student student) {
		try {
			studentService.addNewStudent(student);
		return "student added successfully";	
		}
		catch(Exception e) {
			return "error creating new student. "+ e.getMessage();
		}
	}

}
