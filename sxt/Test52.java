package com.zhangyan.sxt;

public class Test52 implements Runnable {
	int i=100;
	public static void main(String [] args) throws InterruptedException {
		Test52 tt=new Test52();
		Thread t=new Thread(tt);
		t.start();
		Thread.sleep(100);
		tt.m2();
	}
	public void run(){
		m1();
	}
	public synchronized void m1(){
		i=1000;
		try{
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	public void m2(){
		System.out.println(i);
	}
}
