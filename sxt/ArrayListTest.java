package com.zhangyan.sxt;
import java.util.*;
public class ArrayListTest {
	public static void main(String [] args){
		Collection<Object> c=new ArrayList<Object>();
		c.add("haha");
		c.add(new Name("f1","f2"));
		c.add(new Integer(100));
		System.out.println(c.size());
		System.out.println(c);
	}
}
class Name{
	String s1="";
	String s2="";
	Name(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	public String toString(){
		return s1+" "+s2;
	}
}
