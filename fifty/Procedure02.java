package com.zhangyan.fifty;

public class Procedure02 {
	public static void main(String [] args){
		int count =0;	
		for(int i=101;i<=200;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
				}
			}
			if(flag){
				count++;
				System.out.println(i);
			}
		}
		System.out.println("×ÜÊýÎª:"+count);
	}
}
