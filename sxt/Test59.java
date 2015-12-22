package com.zhangyan.sxt;

public class Test59 {
	public static void main(String [] args){
		String s="1,3,3,4;55,2,1;3";
		String [] first=s.split(";");
		int [][] a= new int [first.length][];
		for(int i=0;i<first.length;i++){
			String [] second= first[i].split(",");
			a[i]=new int [second.length];
			for(int j=0;j<second.length;j++){
				a[i][j]=Integer.parseInt(second[j]);
			}
		}
		for(int k[] : a){
			for(int b: k){
				System.out.print(b+" ");
			}
			System.out.println();
		}
	}
}
