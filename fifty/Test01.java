package com.zhangyan.fifty;
import java.util.*;
public class Test01 {
	public static void main(String [] args){
		String s="ABC";
		List<String> result=new ArrayList<String>();
		list(s,"",result);
//		System.out.println(result);
		Iterator<String> it=result.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void list(String s,String buff,List<String> result){
		if(s.length()<=0){
			result.add(buff);
		}
		for(int i=0;i<s.length();i++){
			list(new StringBuffer(s).deleteCharAt(i).toString(),buff+s.charAt(i),result);
		}
	}
}
