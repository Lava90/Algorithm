package com.zhangyan.sxt;

public class Test22 {
	public static void main(String [] args){
		String s="javaisdjfjavasssojdfijavasdjavafsjavadifjsjavadi";
		int i=s.indexOf("sss");
		int count=0;
		while(i>=0){
			i=s.indexOf("sss");
			s=s.substring(i+1);		
			count++;
		}
		if(count==0){
		System.out.println(count-1);
		}else{
			
		}
		
	}
}
