package com.zhangyan.sxt;
import java.io.*;
public class Test39 {
	public static void main(String[] args) throws Exception{
		int k=0;
		FileInputStream in=null;
		FileOutputStream out=null;
		in=new FileInputStream("D:\\TT.txt");
		out=new FileOutputStream("D:\\TTT.txt");
		while((k=in.read())!=-1){
			System.out.print((char)k);
			out.write(k);
		}
		in.close();
		out.close();
	}
}
