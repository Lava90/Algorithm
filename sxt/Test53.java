package com.zhangyan.sxt;

public class Test53 {
	public static void main(String []args){
		Thread1 t1=new Thread1();
//		t1.setName("t1");
		Thread1 t2=new Thread1();
//		t2.setName("t2");
		t1.start();
		t2.start();
		for(int i=0;i<100;i++){
			System.out.println("main"+i);
		}
	}
}
class Thread1 extends Thread{
    int i=0;
	public void run(){
		for(i=0;i<100;i++){
			System.out.println(getName()+" "+i);
		}
	}
}
