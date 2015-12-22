package com.zhangyan.sxt;
import java.util.*;
public class Test27 {
	public static  void main(String [] args){
		List c=new ArrayList<Object>();
		for(int i=0;i<=9;i++){
			c.add("a"+i);
		}
		System.out.println(c);
		Collections.reverse(c);
		System.out.println(c);
		Collections.sort(c);
		System.out.println(c);
		System.out.println(Collections.binarySearch(c, "a7"));
		System.out.println(Collections.max(c));
	}
}
