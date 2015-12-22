package com.zhangyan.fifty;
/*
 * 输入3个数a，b，c，按大小顺序输出。
 */
import java.util.*;
public class Procedure34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Scanner s1=new Scanner(System.in);
		int b=s.nextInt();
		Scanner s2=new Scanner(System.in);
		int c=s.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		Collections.sort(list);
		Collections.reverse(list);
		Iterator it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		System.exit(0);
	}

}
