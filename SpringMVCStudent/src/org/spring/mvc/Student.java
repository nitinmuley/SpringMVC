package org.spring.mvc;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	
	//digits not allowed
	@Pattern(regexp="[^0-9]")
	private String studentName;
	
	private String studentEmail;
	
	@Size(min=2, max=30) @IsValidBloodGrp
	private String studentBloodGrp;
	
	//value should be less than 2222
	@Max(2222)
	private long studentMobile;
	
	
	//value should be less than todays date
	@Past
	private Date studentDOB;
	
	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentBloodGrp() {
		return studentBloodGrp;
	}
	public void setStudentBloodGrp(String studentBloodGrp) {
		this.studentBloodGrp = studentBloodGrp;
	}
	
	
}
