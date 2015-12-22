package com.zhangyan.sxt;

public class Test25 {
	public static void main(String [] args){
		Color c=Color.red;
		switch(c){
		case green:
			System.out.println("green");
			break;
		case red:
			System.out.println("red");
			break;
		case blue:
			System.out.println("blue");
			break;
		}
	}
	protected enum Color{
		red,green,blue;
	}

	
}
//enum Color{
//	red,green,blue;
//}
