package com.zhangyan.fifty;
import java.util.*;
public class Procedure05 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ���ɼ�:");
		int n=sc.nextInt();
		char c;
		c=n>=90?'A':n>=60?'B':'C';
		System.out.print(c);
		sc.close();
	}
}
