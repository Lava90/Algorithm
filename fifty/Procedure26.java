package com.zhangyan.fifty;
/*
 * ���������ڼ��ĵ�һ����ĸ���ж�һ�������ڼ��������һ����ĸһ��������� �жϵڶ�����ĸ��
 * ����  ����������������������������������������������������������������������������������������������������������
 */
import java.util.*;
public class Procedure26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getChar();
	}
	public static String getChar(){
		Scanner s=new Scanner(System.in);
		String c=s.next();
//		System.out.println(c);
		if(c.equals("m")||c.equals("M")){
			System.out.println("monday");
		}else if(c.equals("w")||c.equals("W")){
			System.out.println("wednesday");
		}else if(c.equals("f")||c.equals("F")){
			System.out.println("friday");
		}else if(c.equals("t")||c.equals("T")){
			System.out.println("������ڶ�����ĸ");
			Scanner s1=new Scanner(System.in);
			String c1=s1.nextLine();
			if(c1.equals("u")||c1.equals("U")){
				System.out.println("tuesday");
			}else if(c1.equals("h")||c1.equals("H")){
				System.out.println("thursday");
			}else{
				System.out.println("��������ȷ��ĸ");
				c=getChar();
			}
		}else if(c.equals("s")||c.equals("S")){
			System.out.println("������ڶ�����ĸ");
			Scanner s2=new Scanner(System.in);
			String c2=s2.nextLine();
			if(c2.equals("a")||c2.equals("A")){
				System.out.println("saturday");
			}else if(c2.equals("u")||c2.equals("U")){
				System.out.println("sunday");
			}else{
				System.out.println("��������ȷ��ĸ");
				c=getChar();
			}
		}else{
			System.out.println("��������ȷ��ĸ");
			c=getChar();
		}
		return c;
	}

}
