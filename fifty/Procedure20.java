package com.zhangyan.fifty;
/*
 * ��һ�������У�2/1 3/2 5/3 8/5 13/8 21/13 ���������е�ǰ20 ��֮�͡�
 */
public class Procedure20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2,y=1;
		double sum=0;
		for(int i=1;i<=5;i++){
			System.out.print(x+"/"+y);
			sum+=x/y;
			if(i!=5){
				System.out.print("+");
			}
			x=x+y;
			y=x-y;
		}
		System.out.println("="+sum);
	}

}
