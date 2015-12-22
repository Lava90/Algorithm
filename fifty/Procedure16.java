package com.zhangyan.fifty;
/*
 * Êä³ö9*9¿Ú¾÷
 */
public class Procedure16 {
	public static void main(String [] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}
