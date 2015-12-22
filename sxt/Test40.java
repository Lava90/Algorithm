package com.zhangyan.sxt;
import java.io.*;
public class Test40 {
	public static void main(String [] args) throws Exception{
		FileOutputStream out=null;
		out=new FileOutputStream ("D:\\a.txt");
		for(int i=0;i<100;i++){
			out.write(i);
		}
		out.close();
		
		
	}

}
