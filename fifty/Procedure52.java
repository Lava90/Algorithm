package com.zhangyan.fifty;

import java.util.Scanner;

/*
 * ����whileҲ���������� Scanner 
 * 
 * �������ĺá�
 */
public class Procedure52 {
	public static void main(String [] args){
		System.out.println(getChar());
	}
	public static char getChar(){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char c=str.charAt(0);
		if(c<'A'||c>'Z'){
			System.out.println("����������");
			c=getChar();
		}
		return c;
	}
}
