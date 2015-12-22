package com.zhangyan.sxt;
import java.util.*;
public class Test29 {
	public static void main(String [] args){
		Map<Object ,Object> m1=new TreeMap<Object ,Object>();
		m1.put("one", new Integer(1));
		m1.put("two", "2");
		m1.put("three", "3");
		Map<Object,Object> m2=new HashMap<Object,Object>();
		m2.put("A", "1");
		m2.put("B", "2");
		m1.get("one");
		System.out.println(m1.get("one"));
//		int i=(Integer.valueOf((m1.get("one")).toString())).intValue();		
		int j=(Integer)m1.get("one");
		System.out.println(j);
////		System.out.println(m1.put("two", "2"));
//		System.out.println(m1.containsKey("one"));
//		System.out.println(m1.containsValue("3"));
//		System.out.println(m1.isEmpty());
//		System.out.println(m1.size());
////		System.out.println();
//		Map<Object,Object> m3=new TreeMap<Object,Object>(m1);
////		System.out.println(m3);
//		m3.putAll(m2);
//		System.out.println(m3);
//		System.out.println(m2);
//		System.out.println(m1);
////		?m1.clear();
//		System.out.println(m1);
		
	}
}
