package com.zhangyan.sxt;
import java.util.*;
public class ListTest {
	public static void main(String []args){
		List<Object> l=new LinkedList<Object>();
		for(int i=0;i<=5;i++){
			l.add("a"+i);
		}
		System.out.println(l);
		l.add(3,"a100");
		System.out.println(l);
		l.set(6, "a200");
		System.out.println(l);
		System.out.print((String)l.get(2));
		System.out.println(l.indexOf("a3"));
		l.remove(1);
		System.out.println(l);
	}
}
