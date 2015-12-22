package com.zhangyan.sxt;

public class ExceptionTest {
	public static void main(String[]args) throws MyException{
		int i = 0;
		if(i==0){
			throw new MyException("ÎÒµÄ´íÎó");
		}
	}
}
class MyException extends Exception{
	public MyException(String msg){
		super(msg);
	}
}
