package com.zhangyan.fifty;
/*
 * ��n����Χ��һ��Ȧ�ӣ�˳���źš���һ���˿�ʼ��������1��3������������3�����˳�Ȧ�ӣ�
 * ��������µ���ԭ���ĵڼ��ŵ���λ��
 */
import java.util.*;
public class Procedure37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean [] a=new boolean[n];
		for(int i=0;i<a.length;i++){
			a[i]=true;
		}
		int leftcount=n;
		int index=0;
		int countNum=0;
		while(leftcount>1){
			if(a[index]==true){
				countNum++;
				if(countNum==3){
					a[index]=false;
					countNum=0;
					leftcount--;
				}
			}
			index++;
			if(index==n){
				index=0;
			}	
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==true){
				System.out.println("��������"+(i+1));
			}
		}
	}

}
