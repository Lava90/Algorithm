package com.zhangyan.sxt;

public class Test5 {
	public static void main(String [] args){
		int [][] a;
		a=new int [3][];
		a[0]=new int [3];
		a[1]=new int [4];
		a[2]=new int [3];
		int [][] b=new int [a.length][];
		System.arraycopy(a, 0, b, 0, a.length);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=1;
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");			
			}
			System.out.println();
		}
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
