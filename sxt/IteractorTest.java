package com.zhangyan.sxt;
import java.util.*;
public class IteractorTest {
	public static void main(String [] args){
		Collection<Object> c=new HashSet<Object>();
		c.add(new MM("f1","l1"));
		c.add(new MM("f2","l2"));
		c.add(new MM("f3","l3"));
		Iterator it= c.iterator();
		while(it.hasNext()){
			MM mm=(MM)it.next();
			System.out.println(mm.getFirst());
		}
	}
}
class MM{
	String first="";
	String second="";
	public String  getFirst(){
		return first;
	}
	MM (String s1,String s2){
		this.first=s1;
		this.second=s2;
	}
	
}
