package com.zhangyan.fifty;
/*
 * 对10个数进行排序
 */
public class Procedure28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={4,1,3,5,79,21,6,8,2,9,10};
		for(int i=0;i<10;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int k;
					k=a[i];
					a[i]=a[j];
					a[j]=k;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
