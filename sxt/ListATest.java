package com.zhangyan.sxt;
import java.util.*;
public class ListATest {
	@SuppressWarnings("unchecked")
	public static void main(String [] args){
		LinkedList l=new LinkedList();
		for(int i=0;i<=9;i++){
			l.add("a"+i);
		}
		for(Object o:l){
			System.out.print((String)o+" ");
		}
		System.out.println();
		Collections.shuffle(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,"a5"));
		System.exit(0);
	}
}
