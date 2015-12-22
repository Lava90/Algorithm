package com.zhangyan.sxt;

public class Test33 {
	public static void main(String [] args){
		String s="1,23,4;34,4,5;3";
		String [] s1=s.split(";");
		int [][] a=new int [s1.length][];
		for(int i=0;i<s1.length;i++){
			String []s2=s1[i].split(",");
			a[i]=new int [s2.length];
			for(int j=0;j<s2.length;j++){
				a[i][j]=Integer.parseInt(s2[j]);
			}
		}
		for(int [] a1:a){
			for(int a2 : a1){
				System.out.print(a2+" ");
			}
			System.out.println();
		}
	}
}
