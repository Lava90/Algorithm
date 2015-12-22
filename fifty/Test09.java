package com.zhangyan.fifty;
import java.util.*;
public class Test09 {
	public static void main(String [] args){
		String s="aaa bbbb ccc ab d";
		StringBuffer sb=new StringBuffer(s);
		for(int j=0;j<sb.length();j++){
			if(sb.charAt(j)==' '){
				sb.deleteCharAt(j);
			}
		}
		String str=sb.toString();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char [] c= str.toCharArray();
		for(int i=0;i<c.length;i++){
			if(!map.containsKey(c[i])){
				map.put(c[i], 1);
			}else{
				map.replace(c[i], (map.get(c[i]))+1);
			}
		}
		System.out.println(map);
	}
}
