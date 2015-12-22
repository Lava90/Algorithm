package com.zhangyan.sxt;

public class ArrayTest2 {
	public static void main(String[]args){
		D[] d;
		d=new D[5];
		for(int i=0;i<5;i++){
			d[i]=new D(1,i);
			System.out.println(d[i].i+"-"+d[i].j);
		}
	}
}
class D{
	int i,j;
	D(int i,int j){
		this.i=i;
		this.j=j;
	}
}
