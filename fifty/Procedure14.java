package com.zhangyan.fifty;
import java.util.*;
/*
 * ����ĳ��ĳ��ĳ�գ��ж���������һ��ĵڼ��졣
 */
public class Procedure14 {
	public static void main(String [] args){
		int year,mouth,day;
		int days=0;
		int sum=0;
		System.out.print("������ݣ�");
		Scanner s=new Scanner(System.in);
		year=s.nextInt();
		System.out.print("�����·ݣ�");
		Scanner s1=new Scanner(System.in);
		mouth=s1.nextInt();
		System.out.print("�������ӣ�");
		Scanner s2=new Scanner(System.in);
		day=s2.nextInt();
		
		
		for(int i=1;i<mouth;i++){
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
				days=31;
			}
			if(i==4||i==6||i==8||i==9||i==11){
				days=30;
			}
			if(year%400==0||(year%4==0&&year%100!=0)){
				days=29;
			}else{
				days=28;
			}
			sum+=days;
		}
		System.out.println(days+day);
	}
}
