package com.zhangyan.sxt;

public class Test13 {
	public static void main(String [] args){
		Test13 t=new Test13(12);
		t.incream();
		System.out.println(t.incream());
		System.out.println(t);
		System.out.println(t.incream().equals(t));
		
	}
	int i=0;
	Test13(int i){
		this.i=i;
		System.out.println("�������캯��");
	}
	Test13(){
		System.out.println("Ĭ�Ϲ��캯��");
	}
	public Test13 incream(){
		i++;
		System.out.println("increan����");
		return this;
	}
}
