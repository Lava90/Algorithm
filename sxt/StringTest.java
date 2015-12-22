package com.zhangyan.sxt;

public class StringTest {
	public static void main(String []args){
//		String s="abcdefghigklmn";
//		int i=s.indexOf("c");
//		char j=s.charAt(3);
//		String s1=s.replace('a', 'b');
//		String s2=s.substring(3, 5);
//		System.out.println(s2);
		String s="Mary,F,1900";
		String [] sp=s.split(",");
		for(int i=0;i<sp.length;i++){
			System.out.println(sp[i]);
		}
	}
}
