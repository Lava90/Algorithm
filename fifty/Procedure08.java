package com.zhangyan.fifty;
import java.util.*;
public class Procedure08 {
	public static void main(String [] args){
		System.out.println("����a��ֵ��");
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("����n��ֵ��");
		int n;
		Scanner sca=new Scanner(System.in);
		n=sca.nextInt();
		int k=a,total=0;
		for(int i=1;i<=n;i++){
			total+=k;
			k=k*10+a;
		}
		System.out.println(total);
		sc.close();
		sca.close();
		System.exit(0);
	}
}
