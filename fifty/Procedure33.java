package com.zhangyan.fifty;
/*
 * ��ӡ��������ǡ�10��
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */
public class Procedure33 {
	public static void main(String[] args) {
		int [] up=new int [20];
		for(int i=1;i<=10;i++){
			int [] a=new int [i];
			for(int j=0;j<i;j++){
				if(j==0||j==i-1){
					a[j]=up[j]=1;
				}
				//������Ǻ��ĵĶ���������upΪ��һ������
				if(i>=3&&j!=0&&j!=i-1){
					a[j]=up[j-1]+up[j];
				}			
			}
			//�ѱ���ѭ�����ݣ�����up�У����´�ѭ��ʹ��
			for(int k=0;k<i;k++){
				up[k]=a[k];
			}
			for(int k=0;k<i;k++){
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}
	}
}
