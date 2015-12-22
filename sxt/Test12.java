package com.zhangyan.sxt;

public class Test12 {
	public static void main(String [] args){
		int first=1;
		int second=1;
		for(int i=3;i<=6;i++){
			second=first+second;
			first=second-first;
		}
		System.out.println(second);
	}
}
