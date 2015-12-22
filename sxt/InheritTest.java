package com.zhangyan.sxt;

public class InheritTest {
	public static void main(String [] args){
		Student student=new Student();
		student.setAge(30);
		student.setName("zhang");
		student.setSchool("haerbin");
		System.out.println(student.getAge()+student.getName()+student.getSchool());
	}
	
}
class Person{
	private int age=10;
	private String name;
	public void setAge(int age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
}
class Student extends Person{
	private String school;
	public void setSchool(String school){
		this.school=school;
	}
		
	public String getSchool(){
		return school;
	}
//	 Student() {
//		System.out.println(Person.age);
//	}
}