package com.zhangyan.sxt;
import java.util.*;
public class Test36 {
	public static void main(String [] args){
		Map<String,Integer> m=new HashMap<String ,Integer>();
		for(int i=0;i<args.length;i++){
			Integer value=m.get(args[i]);
			m.put(args[i], value==null ? 1 :value+1);
		}
		System.out.println(m);
	}
}
