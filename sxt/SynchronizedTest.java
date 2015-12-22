package com.zhangyan.sxt;

public class SynchronizedTest implements Runnable {
	public static void main(String [] args){
		SynchronizedTest s=new SynchronizedTest();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}
	Timer time=new Timer();//确保两个timer.add()的方法是一个。
	public void run(){
		time.add(Thread.currentThread().getName());
	}
	
}
class Timer{
	static int num=0;
	public synchronized void add(String s){
		num++;
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s+"是第"+num+"个timer");
	}
}
