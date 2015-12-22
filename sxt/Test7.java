package com.zhangyan.sxt;

public class Test7 {
	public static void main(String [] args){
		int result=0;
		for(int i=1;i<=10;i++){
			int k=1;
			for(int j=1;j<=i;j++){
				k=k*j;
			}
			result+=k;
		}
		System.out.println(result);
	}
}
