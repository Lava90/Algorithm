package com.zhangyan.sxt;

public class Test3 {
	public static void main(String [] args){
		I i=new TT();
		i.eat();
		T t=new Test2_interface();
		t.eat();
		Test2 t1=new Test2_interface();
		t1.enjoy();
		t1.eat();
		System.out.println(t1.A);
		
	}
}
class TT implements I{
	public void eat(){
		System.out.println("eat1");
	}
}
interface I{
	public abstract void eat();
}