package com.zhangyan.fifty;
/*���һ����ǡ�õ�����������֮�ͣ�������ͳ�Ϊ����������
 * ����6=1+2+3��
 */
public class Procedure09 {
	public static void main(String [] args){
		for(int i=1;i<=1000;i++){
			int sum=0;
			for(int j=1;j<=i/2;j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(i==sum){
				System.out.println(i);
			}
		}
	}
}
