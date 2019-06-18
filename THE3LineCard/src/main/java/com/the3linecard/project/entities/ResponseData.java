package com.the3linecard.project.entities;

public class ResponseData {
	
	public Student student;
	
	public String msg;

	public ResponseData(Student student, String msg) {
		super();
		this.student = student;
		this.msg = msg;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
