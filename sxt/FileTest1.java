package com.zhangyan.sxt;

import java.io.File;

public class FileTest1 {
	public static void main(String [] args){
		String seperactor=File.separator;
		String filename="test.txt";
		String path="1"+seperactor+"2";
		File file=new File(path,filename);
		if(file.exists()){
			System.out.println(file.getName());
			System.out.println(file.getAbsolutePath());
		}else{
			file.mkdirs();
			try{
				file.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
