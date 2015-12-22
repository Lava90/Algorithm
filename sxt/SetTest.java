package com.zhangyan.sxt;
import java.util.*;
public class SetTest {
	public static void main(String [] args){
		Set<Object> s1=new HashSet<Object>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		Set<Object> s2=new HashSet<Object>();
		s2.add("a");
		s2.add("d");
		s2.add("b");
		Set<Object> sn=new HashSet<Object>(s1);
		sn.retainAll(s2);
		System.out.println(sn);
		Set<Object> su=new HashSet<Object>(s1);
		su.addAll(s2);
		System.out.println(su);
	}
}
