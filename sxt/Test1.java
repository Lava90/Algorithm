package com.zhangyan.sxt;

public class Test1 {
	public static void main(String [] args){
		Animal a=new Dog();
		a.eat();
		Dog  d=(Dog)a;
		d.enjoy();
		
	}
}
abstract class Animal{
	public abstract void eat();
}
class Dog extends Animal{
	public void eat(){
		System.out.println("����");
	}
	public void enjoy(){
		System.out.println("����");
	}
	
}
