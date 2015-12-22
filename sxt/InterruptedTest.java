package com.zhangyan.sxt;
import java.util.Date;
public class InterruptedTest {
	public static void main(String [] args){
		Interrupte in=new Interrupte();
		Thread t=new Thread(in);
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.flag=false;
	}
}
class Interrupte implements Runnable{
	static boolean flag=true;
	public void run(){
		while(flag){
			System.out.println("====="+new Date()+"====");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}
	}
}
