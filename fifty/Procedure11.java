package com.zhangyan.fifty;
/*
 * ��1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ����
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
