package com.zhangyan.fifty;
/*
 * �� 1��+2��+3��+  +20���ĺ�
 */
public class Procedure21 {
	public static void main(String [] args){
		int sum=0;
		int k=1;
		for(int i=1;i<=20;i++){
			k=k*i;
			sum+=k;
		}
		System.out.println(sum);
	}
}
