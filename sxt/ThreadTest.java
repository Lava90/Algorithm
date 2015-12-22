package com.zhangyan.sxt;

public class ThreadTest {
	public static void main(String []args){
		MyThread mythread=new MyThread();
		Thread t=new Thread(mythread);
		t.start();
		for(int i=0;i<100;i++){
			System.out.println("main"+i);
		}
	}
}
class MyThread implements Runnable {
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("myThread"+i);
		}
	}
}
