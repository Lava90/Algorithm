package com.zhangyan.fifty;

public class Procedure03 {
	public static void main(String [] args){
		
		for(int i=100;i<=999;i++){
			int a,b,c;
			a=i/100;
			b=i%100/10;
			c=i%10;
			if(i==a*a*a+b*b*b+c*c*c){
				System.out.println(i);
			}
		}
	}
}
