package com.zhangyan.sxt;

public class Test16 {
	public static void main(String []args){
		FatherClass f=new ChildClass();
	}
}
class ChildClass extends FatherClass{
	ChildClass (){
		
		this(3);
	}
	ChildClass (int i){
//		super(4);
		System.out.println(i);
	}
}
class FatherClass{
	FatherClass(){
		System.out.println("hahah");
	}
	FatherClass(int i){
		System.out.println("father");
	}
}
