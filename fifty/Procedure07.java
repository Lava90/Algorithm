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
		System.out.print("��ĸ��"+word+"��");
		System.out.print("���ֹ�"+num+"��");
		System.out.print("�ո�"+blank+"��");
		System.out.println("������"+other+"��");
		sc.close();
	}
}
