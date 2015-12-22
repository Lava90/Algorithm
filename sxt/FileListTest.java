package com.zhangyan.sxt;
import java.io.*;
public class FileListTest {
	public static void main(String [] args){
		File f=new File("E:/src");
		tree(f);
	}
	public static void tree(File file){
		File [] child=file.listFiles();
		for(int i=0;i<child.length;i++){
			System.out.println(child[i].getName());
			if(child[i].isDirectory()){
				tree(child[i]);
			}
		}
	}
	
}
