package com.zhangyan.sxt;

public class Test19 {
	public static void main(String [] args){
		String s="1,2;3,4;5,6,7";
		String [] first=s.split(";");
		int [][] a=new int [first.length][];
		for(int i=0;i<first.length;i++){
			String [] second=first[i].split(",");
			a[i]=new int [second.length];
			for(int j=0;j<second.length;j++){
				a[i][j]=Integer.parseInt(second[j]);
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
