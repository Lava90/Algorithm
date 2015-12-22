package com.zhangyan.sxt;

public class ArrayTest {
	public static void main(String[]args){
		Date [] dates ;
		dates =new Date[3];
		for(int i=0;i<3;i++){
			dates[i]=new Date(2015,11,i+1);
			System.out.println(dates[i].year+"-"+dates[i].mouth+"-"+dates[i].day);
		}
//		dates[1]=new Date(211,22,1);
//		System.out.println(dates[1].year+"-"+dates[1].mouth+"-"+dates[1].day);
	}
}
class Date{
	int year,mouth,day;
	public Date(int year, int mouth, int day){
		this.year=year;
		this.mouth=mouth;
		this.day=day;
	}
}