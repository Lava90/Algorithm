package com.zhangyan.sxt;

public class Test60 {
	public static void main(String[] args){
		parent p=new Son();
		p.test();
	}
}
class Son extends parent {
	public void test(){
		System.out.println("son");
	}
}
class parent {
	public void test(){
		System.out.println("parent");
	}
}
