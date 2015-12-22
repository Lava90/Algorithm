package com.zhangyan.sxt;
import java.io.*;
public class Test41 {
	public static void main(String [] args) throws Exception{
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos);
		dos.writeDouble(Math.random());
		dos.writeBoolean(false);
		System.out.println(dos.size());
		ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
		DataInputStream dis=new DataInputStream(bais);
		System.out.println(dis.readDouble()+" "+dis.readBoolean());
	}
}
