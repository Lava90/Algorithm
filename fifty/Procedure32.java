package com.zhangyan.fifty;
/*
 * ȡһ������a���Ҷ˿�ʼ��4~7λ��
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
