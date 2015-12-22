package com.zhangyan.fifty;
/*一个球从100米高度自由落下，每次落地后反跳会原高度的一半；在落下，
 * 求它在第10次落地时，共经过多少米？第十次反弹多高。
 */
public class Procedure10 {
	public static void main(String [] args){
		double k=150;
		double sum=0;
		for(int i=1;i<=10;i++){
			sum+=k;
			k=k/2;
		}
		sum=sum-k/3;
		System.out.println(sum);
		System.out.println(k/3);
	}
//	public static void main(String []args){
//		double h=100,s=100;
//		for(int i=1;i<=10;i++){
//			s=s+h;
//			h=h/2;
//		}
//		System.out.println(s);
//		System.out.println(h/2);
//	}
}
