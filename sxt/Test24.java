package com.zhangyan.sxt;
import java.io.File;
public class Test24 {
	public static void main(String [] args){
		File file=new File("D:/");
		listPath(file);
	}
	public static void listPath(File file){
		File[] childs=file.listFiles();
		for(int i=0;i<childs.length;i++){
			System.out.println(childs[i].getName());
			if(childs[i].isDirectory()){
				listPath(childs[i]);
			}
		}
		
	}
}
