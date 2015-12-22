package com.zhangyan.sxt;

public class Test {
	public static void main(String[]args){
		S s=new S();
		s.i=12;
		System.out.println("1111    "+s.i);
		S s1=new S();
		s1.i=13;
		System.out.println("2222    "+s1.i);
	}
	
}
class S{
	public  int i=11;
	S(){
		System.out.println("3333    "+i);
	}
}
