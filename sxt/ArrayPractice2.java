package com.zhangyan.sxt;

public class ArrayPractice2 {
	public static void main(String []args){
		if(args.length<3){
			System.out.println("\"n1\" \"n2\'");
			System.exit(0);
		}
		double d1=Double.parseDouble(args[0]);
		double d2=Double.parseDouble(args[2]);
		double d3=0;
		
		if(args[1].equals("+")){
			d3=d1+d2;
		}else if(args[1].equals("x")){
			d3=d1*d2;
		}else if(args[1].equals("/")){
			d3=d1/d2;
		}else if(args[1].equals("-")){
			d3=d1-d2;
		}else{
			System.out.println("ÊäÈë¸ñÊ½´íÎó");
			System.exit(0);
		}
		System.out.println(d3);
	}
}
