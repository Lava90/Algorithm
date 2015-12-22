package com.zhangyan.fifty;
/*
 * 一个5位数，判断它是不是回文数，即12321是回文数，个位与万位相同，十位与千位相同。
 */
import java.util.*;
public class Procedure25 {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=String.valueOf(n);		
		StringBuffer sb=new StringBuffer(str);
		
		
		
//		System.out.println(sb);
//		StringBuffer sb1=sb.reverse();
//		sb.reverse();
//		System.out.println(sb);
//		System.out.println(sb1);
//		System.out.println(sb.equals(sb1));
//		
		
		int n1=Integer.valueOf(sb.reverse().toString());
		System.out.println(n+"   "+n1);
		if(n==n1){
			System.out.println("该数字是回文字");
		}else{
			System.out.println("不是回文字");
		}
	}
}
