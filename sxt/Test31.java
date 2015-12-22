package com.zhangyan.sxt;
import java.util.*;
public class Test31 {
	public static void main(String []args){
		Map<String , Integer> m=new HashMap<String ,Integer> ();
		final int ONE=1;
		for(int i=0;i<args.length;i++){
			Integer k=(Integer)m.get(args[i]);
			m.put(args[i], k==null ? ONE : k+1 );
		}
		System.out.println(m);
		System.out.println("sdf");
	}
}
