package com.zhangyan.fifty;
/*һ�����100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�
 * �����ڵ�10�����ʱ�������������ף���ʮ�η�����ߡ�
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
