package com.zhangyan.fifty;

public class Procedure01 {
	public static void main(String [] args){
		int k1=1,k2=1;
		int j=1;
		for(int i=3;i<=18;i++){
			j=k1+k2;
			k2=j;
			k1=j-k1;
			System.out.println("第"+i+"个月,的数量为："+j+"对");
		}
		
	}
}
