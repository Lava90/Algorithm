package com.zhangyan.fifty;
import java.util.*;
public class Procedure04 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(n+"=");
		int k=2;
		while(k<=n){
			if(k==n){
				System.out.print(n);
				break;
			}else if(n%k==0){
				System.out.print(k+"*");
				n=n/k;
			}else{
				k++;
			}
		}
		sc.close();
		
	}
}
