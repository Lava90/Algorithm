package com.zhangyan.sxt;

public class Test13 {
	public static void main(String [] args){
		Test13 t=new Test13(12);
		t.incream();
		System.out.println(t.incream());
		System.out.println(t);
		System.out.println(t.incream().equals(t));
		
	}
	int i=0;
	Test13(int i){
		this.i=i;
		System.out.println("参数构造函数");
	}
	Test13(){
		System.out.println("默认构造函数");
	}
	public Test13 incream(){
		i++;
		System.out.println("increan方法");
		return this;
	}
}
