package com.zhangyan.fifty;

public class Test03 {
	public static void main(String [] args){
		int a=19;
		int b=34;
		System.out.println(a);
		System.out.println(b);
		System.out.println("%%%%%%%%%%%%%%%%%%");
		int c;
		c=a+b;
		a=c-a;
		b=c-b;
		System.out.println(a);
		System.out.println(b);
		System.exit(0);
	}
}
