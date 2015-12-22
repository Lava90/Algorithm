package com.zhangyan.sxt;

public class Test51 {
	public static void main(String [] args){
		Test51 t=new Test51();
		t.m1();
	}
	public void m1(){
		m2();
	}
	public void m2(){
		System.out.println("m2");
	}
}
