package com.zhangyan.fifty;
/*
 * һ��5λ�����ж����ǲ��ǻ���������12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��
 */
import java.util.*;
public class Procedure25 {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=String.valueOf(n);		
		StringBuffer sb=new StringBuffer(str);
		
		
		
//		System.out.println(sb);
//		StringBuffer sb1=sb.reverse();
//		sb.reverse();
//		System.out.println(sb);
//		System.out.println(sb1);
//		System.out.println(sb.equals(sb1));
//		
		
		int n1=Integer.valueOf(sb.reverse().toString());
		System.out.println(n+"   "+n1);
		if(n==n1){
			System.out.println("�������ǻ�����");
		}else{
			System.out.println("���ǻ�����");
		}
	}
}
