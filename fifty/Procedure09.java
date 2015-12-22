package com.zhangyan.fifty;
/*如果一个数恰好等于它的因子之和，这个数就成为“完数”。
 * 例如6=1+2+3。
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
