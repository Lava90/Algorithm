package com.zhangyan.sxt;
import java.util.*;
public class ArrayListTest2 {
	public static void main(String [] args){
		Collection<Object> c=new ArrayList<Object>();
		c.add("haha");
		c.add(new Integer(100));
		c.add(new M("f1","f2"));
		System.out.println(c.size());
		System.out.println(c);
		c.remove("haha");
		c.remove(new Integer(100));
		System.out.println(c);
		c.remove(new M("f1","f2"));
		System.out.println(c);
		
	}
}
class M{
	String s1="";
	String s2="";
	M(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	public String toString(){
		return s1+" "+s2;
	}
	public boolean equals(Object object){
		if(object instanceof M){
			M m=(M)object;
			return s1.equals(m.s1)&&s2.equals(m.s2);
		}
		return super.equals(object);
	}
	public int hashCode(){
		return s1.hashCode();
	}
}

