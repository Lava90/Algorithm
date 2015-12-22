package com.zhangyan.sxt;
import java.io.*;
public class Test42 {
	public static void main(String []args) throws Exception{
		
//		FileInputStream fis=new FileInputStream("D:/T.java");
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s="";
		while((s=br.readLine())!=null){
			System.out.println(s);
		}
		br.close();
	}
}
