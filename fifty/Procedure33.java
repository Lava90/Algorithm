package com.zhangyan.fifty;
/*
 * 打印出杨辉三角。10行
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
				//杨辉三角核心的东西，其中up为上一层数据
				if(i>=3&&j!=0&&j!=i-1){
					a[j]=up[j-1]+up[j];
				}			
			}
			//把本次循环数据，放入up中，供下次循环使用
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
