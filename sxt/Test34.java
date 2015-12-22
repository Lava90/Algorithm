package com.zhangyan.sxt;
import java.util.*;
public class Test34 {
	public static void main(String [] args){
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(int i=0;i<args.length;i++){
			Integer k=(Integer)m.get(args[i]);
			m.put(args[i], k==null ? 1 : k+1);
		}
		System.out.println(m);
	}
}
