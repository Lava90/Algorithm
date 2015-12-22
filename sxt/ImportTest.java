package com.zhangyan.sxt;
import java.io.*;
public class ImportTest {
	public static void main(String []args)throws Exception{
		File file=new File("D:/11/");
//		ImportTest it=new ImportTest();
//		it.F(file);
		F(file);
	}
	public static void F(File file)throws Exception{
		File[] ff=file.listFiles();
		for(int i=0;i<ff.length;i++){
			if(ff[i].isDirectory()){
				F(ff[i]);
			}else{
				FileInputStream fis=new FileInputStream(ff[i].getParent()+"\\"+ff[i].getName());
				InputStreamReader isr=new InputStreamReader(fis);
				BufferedReader br=new BufferedReader(isr);
				FileOutputStream fos=new FileOutputStream("D:/java.txt",true);
				OutputStreamWriter osw=new OutputStreamWriter(fos);
				BufferedWriter bw=new BufferedWriter(osw);
				String s=null;
				while((s=br.readLine())!=null){
					bw.write(s);
					bw.newLine();
				}
				br.close();
				bw.close();
				System.out.println(ff[i].getName());
			}
		}
	}
}
