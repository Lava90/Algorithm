package com.zhangyan.fifty;
/*
 * 有5个人坐在一起，
 * 问第五个人岁数，他说比第四个人大2岁，
 * 问第四个人岁数，他说比第三个人大2岁，
 * 问第三个人岁数，他说比第二个人大2岁，
 * 问 第二个人岁数，他说比第一个人大2岁。
 * 问最后一个人岁数，他说是10岁，请问第五个人多大。
 */
public class Procedure23 {
	public static void main(String [] args){
		int n=10;
		for(int i=1;i<5;i++){
			n=n+2;
		}
		System.out.println(n);
	}
}
