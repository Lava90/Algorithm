package com.zhangyan.fifty;
import java.util.*;
public class Test10 {
	public static  void main(String [] args){
		String s="acbdfe";
		char []c =s.toCharArray();
		List<Character> list=new ArrayList<Character>();
		for(int i=0;i<s.length();i++){
			list.add(c[i]);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
