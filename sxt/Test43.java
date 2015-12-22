package com.zhangyan.sxt;
import java.io.*;
public class Test43 {
	public static void main(String [] args)throws Exception{
		File file=new File("D:/11/");
		director(file);
	}
	public static void director(File file)throws Exception{
		File [] files=file.listFiles();
		for(int i=0;i<files.length;i++){
			if(files[i].isDirectory()){
				director(files[i]);
			}else{
				FileInputStream fis=new FileInputStream(files[i].getParent()+"\\"+files[i].getName());
				InputStreamReader isr=new InputStreamReader(fis);
				BufferedReader br=new BufferedReader(isr);
				FileOutputStream fos=new  FileOutputStream("D:/Test43.java",true);
				OutputStreamWriter  osw=new OutputStreamWriter(fos);
				BufferedWriter bw=new BufferedWriter(osw);
				String s=null;
				while((s=br.readLine())!=null){
					bw.write(s);
					bw.newLine();
				}
				br.close();
				bw.close();
			}
		}
		
	}
}
