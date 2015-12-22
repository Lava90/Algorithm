package com.zhangyan.sxt;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String [] args){
		String separator=File.separator;
		String filename="mytest.txt";
		String directory="3"+separator+"4";
		File f=new File(directory,filename);
		if(f.exists()){
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
		}else{
			f.mkdirs();
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
