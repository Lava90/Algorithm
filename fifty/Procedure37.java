package com.zhangyan.fifty;
/*
 * 有n个人围成一个圈子，顺序排号。从一个人开始报数（从1到3报数）凡报道3的人退出圈子，
 * 问最后留下的是原来的第几号的那位。
 */
import java.util.*;
public class Procedure37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean [] a=new boolean[n];
		for(int i=0;i<a.length;i++){
			a[i]=true;
		}
		int leftcount=n;
		int index=0;
		int countNum=0;
		while(leftcount>1){
			if(a[index]==true){
				countNum++;
				if(countNum==3){
					a[index]=false;
					countNum=0;
					leftcount--;
				}
			}
			index++;
			if(index==n){
				index=0;
			}	
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==true){
				System.out.println("就是你了"+(i+1));
			}
		}
	}

}
