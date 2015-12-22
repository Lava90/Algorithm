package com.zhangyan.sxt;

public class Test35 {
	public static void main(String [] args){
		String s="12,3,4,;2,34,5,5;2,2,2";
		String [] s1=s.split(";");
		int [][] a=new int [s1.length][];
		for(int i=0;i<s1.length;i++){
			String [] s2=s1[i].split(",");
			a[i]=new int [s2.length];
			for(int j=0;j<s2.length;j++){
				a[i][j]=Integer.parseInt(s2[j]);
			}
		}
		for(int []a1: a){
			for(int a2 :a1){
				System.out.print(a2+" ");
			}
			System.out.println();
		}
	}
}
