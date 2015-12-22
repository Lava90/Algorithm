package com.zhangyan.sxt;
import java.util.*;
public class ArrayListTest1 {
	public static void main(String [] args){
		Collection<Object> c=new HashSet<Object>();
		c.add("haha");
		c.add(new Name1("f1","f2"));
		c.add(new Integer(100));
		c.remove("haha");
		c.remove(new Integer(100));
		System.out.println(c);
		System.out.println(c.remove(new Name1("f1","f2")));
		System.exit(0);
	}
}
class Name1{
	String s1="";
	String s2="";
	Name1(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	public String toString(){
		return s1+" "+s2;
	}
	public boolean equals(Object obj){
		if(obj instanceof Name1){
			Name1 name=(Name1)obj;
			return s1.equals(name.s1)&&s2.equals(name.s2);
		}
		return super.equals(obj);
	}
	public int hashCode(){
		return s1.hashCode();
	}
}
