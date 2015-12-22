package com.zhangyan.fifty;

import java.util.Scanner;

/*
 * 不用while也能连续输入 Scanner 
 * 
 * 这个是真的好。
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
			System.out.println("请重新输入");
			c=getChar();
		}
		return c;
	}
}
