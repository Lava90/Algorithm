package com.zhangyan.fifty;
/*
 * 取一个整数a从右端开始的4~7位。
 */
import java.util.*;
public class Procedure32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		i=s.nextInt();
		String str=String.valueOf(i);
		String substr=str.substring(str.length()-7,str.length()-3);
		StringBuffer sb=new StringBuffer(substr);
		sb.reverse();
		System.out.println(sb);
		System.exit(0);
	}

}
