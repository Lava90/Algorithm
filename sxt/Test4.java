package com.zhangyan.sxt;

public interface Test4 {
	public static void main(String [] args) throws MyExc{
		int i=0;
		if(i==0){
			new MyExc("����").printStackTrace();;
		}
	}
}
class MyExc extends Exception{
	public MyExc (String str) {
		super(str);
	}
}
