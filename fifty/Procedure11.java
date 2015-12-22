package com.zhangyan.fifty;
/*
 * 有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？
 */
public class Procedure11 {
//	public static void main(String [] args){
//		int count =0;
//		for(int i=1;i<=4;i++){
//			for(int j=1;j<=3;j++){
//				for(int k=1;k<=2;k++){
//					count++;
//				}
//			}
//		}
//		System.out.println(count);
//	}
	
	
	public static void main(String [] args){
		int count =0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					if(i!=j&&i!=k&&j!=k){
						count++;
						System.out.println(100*i+10*j+k);
					}
				}
			}
		}
		System.out.println(count);
	}
}
