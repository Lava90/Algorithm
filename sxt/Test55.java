package com.zhangyan.sxt;

public class Test55 {
	int i=10;
	public static void main(String [] args){
		Test55 t=new Test55();
		Test55 t1=new Test55(20);
		t.A();
		t1.A();
	}
	Test55(int i){
		this.i=i;
	}
	Test55(){
		System.out.println("test55()"+i);
	}
	public  void A(){
		System.out.println(i);
	}
}
