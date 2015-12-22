package com.zhangyan.sxt;

public class InterfaceTest {
	public static void main(String []args){
		Singer student=new Student1();
		student.sing();
		student.sleep();
		Singer teacher=new Teacher1();
		teacher.sing();
		teacher.sleep();
		Painter paint =(Painter)teacher;
		paint.eat();
		paint.paint();
		Painter t=new Teacher1();
		t.eat();
		t.paint();
				
	}
}
interface Singer{
	public void sing();
	public void sleep();
}
interface Painter{
	public void eat();
	public void paint();
}
class Student1 implements Singer{
	public void sing(){
		System.out.println("student sing");
	}
	public void sleep(){
		System.out.println("student sleep");
	}
}
class Teacher1 implements Singer,Painter{
	public void sing(){
		System.out.println("teacher sing");
	}
	public void sleep(){
		System.out.println("teacher sleep");
	}
	public void eat(){
		System.out.println("teacher eat");
	}
	public void paint(){
		System.out.println("teacher paint");
	}
}

