package com.zhangyan.fifty;
/*
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又吃了一个 。
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。
 * 到第十天早上在想吃的时候，见只剩下一个桃子了，求第一天摘了多少个桃子。
 */
public class Procedure17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		for(int i=2;i<=10;i++){
			x=(x+1)*2;
		}
		System.out.println(x);
	}

}
