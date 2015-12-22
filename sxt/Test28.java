package com.zhangyan.sxt;

public class Test28 {
	public static void main(String [] args){
		C c1=new C("f1","s1");
		C c2=new C("f2","s2");
		System.out.println(c1.compareTo(c1));
	}
}
class C implements Comparable{
	String first="";
	String second="";
	C(String s1,String s2){
		this.first=s1;
		this.second=s2;
	}
	public int compareTo(Object o){
		C c=(C)o;
		if(second.compareTo(c.second)!=0){
			return second.compareTo(c.second);
		}else{
			return first.compareTo(c.first);
		}
	}
}
