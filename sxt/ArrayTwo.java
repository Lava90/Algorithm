package com.zhangyan.sxt;

public class ArrayTwo {
	public static void main(String []args){
		String [][] a=new String [3][];
		a[0]=new String [2];
		a[1]=new String [3];
		a[2]=new String [2];
//		int [][] a=new int [3][];
//		a[0]=new int [2];
//		a[1]=new int [3];
//		a[2]=new int [2];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=new String("Î»ÖÃ"+i+"ÊÇ"+j);
//				a[i][j]=i+j;
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
		}
		
	}
}
