package com.zhangyan.fifty;

public class Test02 {
	public static void main(String [] args){
		String s="zhangyan";
//		System.out.println(getString(s));
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();	
//		sb.reverse();
		System.out.println(sb);
	}
	public static String getString(String s){
		if(s!=null){
			String s1="";
			for(int i=0;i<s.length();i++){
				char c= s.charAt(s.length()-1-i);
				s1=s1+c;
			}
			return s1;
		}else{
			return null;
		}
	}
}
