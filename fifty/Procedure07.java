package com.zhangyan.fifty;
import java.util.*;
public class Procedure07 {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char [] c=str.toCharArray();
		int other=0;
		int num=0;
		int blank=0;
		int word=0;
		for(int i=0;i<c.length;i++){
			if(c[i]>='a'&&c[i]<='z'){
				word++;
			}
			else if(c[i]>='0'&&c[i]<='9'){
				num++;
			}
			else if(c[i]==' '){
				blank++;
			}
			else{
				other++;
			}
			
		}
		System.out.print("字母共"+word+"个");
		System.out.print("数字共"+num+"个");
		System.out.print("空格共"+blank+"个");
		System.out.println("其他共"+other+"个");
		sc.close();
	}
}
