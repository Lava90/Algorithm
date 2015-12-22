package com.zhangyan.sxt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String [] args){
		int b=0;
		FileInputStream in=null;
		try {
			in=new FileInputStream ("D:\\TT.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);
		}
		try {
			while((b=in.read())!=-1){
				System.out.print((char)(b));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
