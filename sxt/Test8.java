package com.zhangyan.sxt;

public interface Test8 {
	public static void main(String [] args){
		int result=0;
		int f=1;
		for(int i=1;i<=10;i++){
			f*=i;
			result+=f;
		}
		System.out.println(result);
	}
}
