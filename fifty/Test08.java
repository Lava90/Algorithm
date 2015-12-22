package com.zhangyan.fifty;

public class Test08 {
	private static Test08 t;
	private Test08 (){
		
	}
	public static Test08 getInstance(){
		if(t==null){
			t=new Test08();
			return t;
		}else{
			return t;
		}
	}
}
