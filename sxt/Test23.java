package com.zhangyan.sxt;

import java.io.File;
import java.io.IOException;

public class Test23 {
	public static void main(String [] args){
		String name="test.txt";
		String separator=File.separator;
		String path="D:";
		File file=new File(path,name);
		
			try {
				file.createNewFile();
				file.createNewFile();
				System.out.println("dsdf");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
}
