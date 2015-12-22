package com.zhangyan.fifty;
/*
 * 一个数加上100后是一个完全平方数。 再加上168又是一个完全平方数。该数是多少。
 */
public class Procedure13 {
	public static void main(String [] args){
		int [] a=new int [10000];
		for(int i=0;i<1000;i++){
			double x=i+100;
			double sqr=Math.sqrt(x);
			int n=(int)sqr;
			if(n==sqr){
				double y=i+268;
				double sqr1=Math.sqrt(y);
				int m=(int)sqr1;
				if(m==sqr1){
					System.out.println(i);
				}
			}
		}
	}
}
