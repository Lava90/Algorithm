package com.zhangyan.sxt;
import java.io.*;
public class Test37 {
	public static void main(String [] args){
		try {
			@SuppressWarnings("resource")
			FileInputStream in=new FileInputStream("D:\\TT.txt");
			while(in.read()!=-1){
				System.out.print((char)in.read());
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
