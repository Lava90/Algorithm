package com.zhangyan.sxt;
import java.util.*;
public class Test26 {
	public static void main(String [] args){
		Collection<Object> c=new HashSet<Object>();
		c.add("haha");
		c.add("haha1");
		c.add("haha2");
		c.add(new Integer(100));
		c.add(new NN("f1","s1"));
//		System.out.println(c);
//		c.remove(new NN("f1","s1"));
//		System.out.println(c.remove(new NN("f1","s1")));
//		System.out.println(c);
		Object [] s= c.toArray();
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
//		Iterator it=c.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next().toString());
//		}
	}
}
class NN{
	private String s1=" ";
	private String s2=" ";
	NN(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}
	public String toString(){
		return this.s1+" "+this.s2;
	}
	public boolean equals(Object obj){
		if(obj instanceof NN){
			return ((NN) obj).s1.equals(this.s1)&&((NN)obj).s2.equals(this.s2);
		}
		return super.equals(obj);
	}
	public int hashCode(){
		return this.s1.hashCode();
	}
	
}
