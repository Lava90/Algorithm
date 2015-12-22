package com.zhangyan.fifty;

public class Test05 {
	public static void main(String [] args){
		String s="this is a test";
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			c[0]=Character.toUpperCase(c[0]);
			if(c[i]==' '){
				c[i+1]=Character.toUpperCase(c[i+1]);
			}
		}
		System.out.println(c);
	}
}
