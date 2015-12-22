package com.zhangyan.sxt;
import java.io.*;
public class PrintStreamTest1 {
	public static void main(String [] args)throws Exception{
		String s=args[0];
		if(s!=null){
			list(s,System.out);
		}
	}
	public static void list(String s,PrintStream p) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader(s));
		String sr=null;
		while((sr=br.readLine())!=null){
			p.println(sr);
		}
	}
}
