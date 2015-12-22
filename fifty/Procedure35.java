package com.zhangyan.fifty;
/*
 * 输入数组，最大与一个元素交互，最小的与最后一个元素交换，输出数组。
 */
public class Procedure35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={10,1,2,3,4,5,6,7,9,8};
		int max=0,max_id=0;
		int min=100,min_id=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>=max){
				max=a[i];
				max_id=i;
			}
			if(a[i]<=min){
				min=a[i];
				min_id=i;
			}
		}
		int k;
		d
		k=a[0];
		a[0]=a[max_id];
		a[max_id]=k;
		int k1;
		k1=a[a.length-1];
		a[a.length-1]=a[min_id];
		a[min_id]=k1;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
	}	
	

}
