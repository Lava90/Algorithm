package com.zhangyan.sxt;

public class AbstactTest extends FatherAbstract{
	public void enjoy(){
		System.out.println("success");
	}
	public static void main(String[]args){
		new AbstactTest().enjoy();
	}
}
abstract class FatherAbstract{
	public abstract void enjoy();
}