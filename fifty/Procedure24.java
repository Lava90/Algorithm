package com.zhangyan.fifty;
/*
 * 给一个不多于5位的正整数，要求：一、求他是几位数。二、逆序打印各位数字。
 */
import java.util.*;
public class Procedure24 {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k;
		if(n/10000!=0){k=5;}
		else if(n/1000!=0){k=4;}
		else if(n/100!=0){k=3;}
		else if(n/10!=0){k=2;}
		else{k=1;}
		System.out.println(k+"位数");
		int k2=k;
		int sum=0;
		int b=1;
		for(int i=1;i<=k2;i++){
			int k1=1;
			for(int j=1;j<=k2-i;j++){
				k1*=10;
			}
			sum+=(n/(k1))*b;
			n=n%(k1);
			k=k-1;
			b=b*10;
		}
		System.out.println("倒序"+sum);
		
		
	}
}
