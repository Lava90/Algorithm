package com.zhangyan.sxt;

public class EnumTest {
	public static void main(String [] args){
		MyColor m= MyColor.blue;
		switch(m){
		case red:
			System.out.println("red");
			break;
//		case blue:
//			System.out.println("bule");
//			break;
		case green:
			System.out.println("green");
			break;
		default :
			System.out.println("df");
		}
		
	}
	public enum MyColor{red,green,blue}
}
