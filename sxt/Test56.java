package com.zhangyan.sxt;

public class Test56 {
	public static void main(String [] args){
		String s="1,2,3;4,5;6,7,7,8,9";
		String [] first=s.split(";");
		for(int i=0;i<first.length;i++){
			String [] second=first[i].split(",");
			for(int j=0;j<second.length;j++){
				System.out.print(second [j]+" ");
			}
			System.out.println();
		}
		System.exit(0);
	}
}
