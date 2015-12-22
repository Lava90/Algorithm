package com.zhangyan.sxt;
import java.io.*;
public class PrintStreamTest {
	public static void main(String [] args)throws Exception{
		PrintStream ps=null;
		FileOutputStream fos=new FileOutputStream("D:/22.txt");
		ps=new PrintStream(fos);
		if(ps!=null){
			System.setOut(ps);
		}
		for(int i=0;i<100;i++){
			System.out.print(i+" ");
		}
	}
}
