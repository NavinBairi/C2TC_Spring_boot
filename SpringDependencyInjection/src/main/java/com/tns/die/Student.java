package com.tns.die;

public class Student {
//	String studentName = "Navin"; // Hard coding 
	private String studentName;
	private int Id;
	
 //  public String getStudentName() {
	//	return studentName;
	//}


/*	public void setId(int id) {
		Id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
*/
	
	//constructor
	public Student(String studentName, int id) {
		super();
		this.studentName = studentName;
		Id = id;
	}
public void disp()
{
	System.out.println("Student name is " + studentName + "and Id is  "+ Id);}


}
