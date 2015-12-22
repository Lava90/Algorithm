package com.zhangyan.sxt;

public class TestEquals {
	public static void main(String []args){
		Cat c1=new Cat(1,"zhang");
		Cat c2=new Cat(2,"yan");
		Cat c3=new Cat(1,"zhang");
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
	
}
class Cat{
	int age;
	String name;
	Cat(int age,String name){
		this.age=age;
		this.name=name;
	}
	public boolean equals(Object obj){
		if(obj==null){
			return false;
		}else{
			if(obj instanceof Cat){
				Cat c=(Cat)obj;
				if(c.age==this.age&& c.name==this.name){
					return true;
				}
			}
			return false;
		}
	}
}
