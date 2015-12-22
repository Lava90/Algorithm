package com.zhangyan.fifty;

public class Test07 {
	public static void main(String [] args){
		System.out.println(digui(6));
	}
	public static int digui(int n){
		if(n==0||n==1){
			return 1;
		}else{
			return n*digui(n-1);
		}
	}
}
