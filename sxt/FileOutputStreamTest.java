package com.zhangyan.sxt;
import java.io.*;
public class FileOutputStreamTest {
	public static void main(String [] args){
		int b=0;
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in=new FileInputStream("D://T.java");
			out=new FileOutputStream("D://TTT.java");
			
			while((b=in.read())!=-1){
//				b=in.read();
				out.write((char)b);
				System.out.print((char)b);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
