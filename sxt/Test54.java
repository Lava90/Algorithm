package com.zhangyan.sxt;

public class Test54 {
	public static void main(String [] args){
		Tread2 t2=new Tread2();
		System.out.println("main"+t2.i);
		Thread t=new Thread(t2);
		Thread t1=new Thread(t2);
//		t.run();
		t.start();
		t1.start();
		System.out.println("main"+t2.i);
		
	}
}
class Tread2 implements Runnable{
	int i=0;
	public void run(){
		i++;
		System.out.println(i);
	}
}