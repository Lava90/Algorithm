package com.zhangyan.sxt;

public class Test6 {
	public static void main(String [] args){
		String s="1,2,3;4,5;6,7,8,9";
		String [] s1=s.split(";");
		int [][] a=new int [s1.length][];
		for(int i=0;i<a.length;i++){
			String [] s2=s1[i].split(",");
			a[i]=new int  [s2.length];
			for(int j=0;j<s2.length;j++){
			a[i][j]=Integer.parseInt(s2[j]);
//				System.out.println(s2[j]);
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
