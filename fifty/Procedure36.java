package com.zhangyan.fifty;
/*
 * 有n个整数，使其前面各数顺序向后移m个位置，最后3个数变成最前面的3的数。
 */
public class Procedure36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int a[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		String str="";
		for(int i=0;i<a.length;i++){
			str+=a[i]+" ";
		}
		String [] s=str.split(" ");
		String before="";
		String after="";
		for(int i=s.length-m;i<s.length;i++){
//			System.out.print(s[i]+" ");
			before+=s[i]+" ";
		}
		for(int i=0;i<s.length-m;i++){
//			System.out.print(s[i]+" ");
			before+=s[i]+" ";
		}
		String string=before+" "+after;
		System.out.println(string);
		System.exit(0);
	}

}
