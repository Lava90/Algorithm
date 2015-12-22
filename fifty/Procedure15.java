package com.zhangyan.fifty;
import java.util.*;
/*
 * 输入三个整数，x.y.z，请吧这三个数由小到大输出。
 */
public class Procedure15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		int count=1;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		Scanner s1=new Scanner(System.in);
		y=s1.nextInt();
		Scanner s2=new Scanner(System.in);
		z=s2.nextInt();
		
		
		if(x>y){
			int n;
			n=x;
			x=y;
			y=n;
		}
		if(x>z){
			int n;
			n=x;
			x=z;
			z=n;
		}
		if(y>z){
			int n;
			n=y;
			y=z;
			z=n;
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
