package com.zhangyan.fifty;
/*
 * 编写一个函数，输入n为偶数时，调用函数求 1/2+1/4+ +1/n.
 * 当输入n为奇数时，调用函数1/1+1/3+  +1/n(利用指针函数)
 */
import java.util.*;
public class Procedure39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		double sum=0;
		if(n%2==0){
			for(int i=1;i<=n;i++){
				double a;
				double b=2*i;
				a=1/b;
				sum+=a;
			}
		}else{
			for(int i=1;i<=n;i++){
				double a;
				double b=2*i-1;
				a=1/b;
				sum+=a;
			}
		}
		System.out.println(sum);
	}

}
