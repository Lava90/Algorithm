package com.zhangyan.sxt;

public class Test50 implements Runnable {
	public static void main(String [] args){
		Test50 t=new Test50();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	Timm t=new Timm();
	public void run(){
		t.add(Thread.currentThread().getName());
	}
}
class Timm{
	static int num=0;
	public synchronized void add(String name){
		num++;
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){
			e.getStackTrace();
		}
		System.out.println(num+"========"+name);
	}
}
