package com.zhangyan.sxt;

public class Test10 {
	public static void main(String [] args){
		int stop=4;
		int skip=4;
		for(int i=0;i<10;i++){
			if(i==stop){break;}
			System.out.println(i);
		}
		System.out.println("``````````````");
		for(int i=0;i<10;i++){
			if(i==skip){continue;}
			System.out.println(i);
		}
	}
}
