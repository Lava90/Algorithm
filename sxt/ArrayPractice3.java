package com.zhangyan.sxt;

public class ArrayPractice3 {
	public static void main(String []args){
		int [] a=new int [args.length];
		for(int i=0;i<args.length;i++){
			a[i]=Integer.parseInt(args[i]);
		}
		print(a);
		sortArray(a);
		print(a);
	}
	public static void print(int [] a ){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void sortArray(int []a ){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					int temp;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
