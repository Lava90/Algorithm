package com.zhangyan.fifty;

import java.util.*;

/*
 * ��һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С�
 */
public class Procedure30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={1,2,6,7,9};
		int k=8;
		int [] b=new int [a.length+1];
//		for(int i=0;i<a.length;i++){
//			b[i]=a[i];
//		}
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
			if(k<a[i]){
				for(int j=i;j<b.length-1;j++){
//					�����������ݺ���Ҫ��
					b[j+1]=a[j];
					b[i]=k;
				}
				break;
			}
		}
		for(int j=0;j<b.length;j++){
			System.out.print(b[j]+" ");
		}
	}

}
