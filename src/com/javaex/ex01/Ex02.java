package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args)throws IOException {
		
		InputStream in = new FileInputStream("C:\\JavaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\JavaStudy\\file\\byteBuffImg.jpg");
		
		byte[] buff = new byte[1024];
		int data=0;
		
		while(true) {
			data = in.read(buff);
			System.out.println(data);
			if(data==-1) {
				break;
			}
			out.write(buff);
		}
		
		
		out.close();
		in.close();
		
	}
}
