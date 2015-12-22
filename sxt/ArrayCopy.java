package com.zhangyan.sxt;

public class ArrayCopy {
	public static void main(String [] args){
		String [] s={"一","二","三","四","五"};
		String [] sbak=new String [s.length];
		System.arraycopy(s, 0, sbak, 0, s.length);
		for(int i=0;i<sbak.length;i++){
			System.out.print(sbak[i]+" ");
		}
		System.out.println();
		int [][] a={{1,2},{3,4,5,8},{6,7,8},{9,0}};
		int [][] abak=new int [4][];
		System.arraycopy(a, 0, abak, 0, a.length);
//		a[1][1]=10;
		for(int i=0;i<abak.length;i++){
			for(int j=0;j<abak[i].length;j++){
				System.out.print(abak[i][j]+" ");
			}
			System.out.println();
		}
	}
}
