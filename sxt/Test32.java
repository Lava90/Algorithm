package com.zhangyan.sxt;

public class Test32 {
	public static void main(String [] args){
		String s="1,2,3;4,3;2,3,4,5;1";
		String [] first=s.split(";");
		int [][] a=new int [first.length][];
		for(int i=0;i<first.length;i++){
			String [] second=first[i].split(",");
			a[i]=new int [second.length];
			for(int j=0;j<second.length;j++){
				a[i][j]= Integer.parseInt(second[j]);
			}
		}
		for(int [] a1:a){
			for(int a2: a1){
				System.out.print(a2+" ");
			}
			System.out.println();
		}
		
	}
}
