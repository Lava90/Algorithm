package com.zhangyan.sxt;
import java.util.*;
public class Test30 {
	public static void main(String [] args){
		int one=1;
		Map <String , Integer>m=new TreeMap <String ,Integer> ();
		for(int i=0;i<args.length;i++){
			Integer k=(Integer)m.get(args[i]);
			m.put(args[i],k == null ? one : k.intValue()+1 );
		}
		System.out.println(m);
	}
}



