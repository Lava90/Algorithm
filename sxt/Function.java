package com.zhangyan.sxt;

public class Function{
	public static void function1() throws NumberFormatException{  
	    System.out.println(Double.parseDouble("abc"));  
	    System.out.println("µÚ¶þÌõÓï¾ä¡£");  
	      
	}  

	public static void main(String[] args) {  
	    try {  
	        function1();  
	    } catch (Exception e) {  
	        System.err.println(e.getMessage());  
	        e.printStackTrace();  
	    }  
	}  
}