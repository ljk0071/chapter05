package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		InputStream is = new FileInputStream("C:\\JavaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bs = new BufferedReader(isr);
//		OutputStream os = new FileOutputStream("C:\\JavaStudy\\file\\PhoneDB.txt");
//		OutputStreamWriter osr = new OutputStreamWriter(os, "MS949");
//		BufferedWriter bw = new BufferedWriter(osr);
		
		String[] detail;
		String str;
//		List<String> dl = new ArrayList<String>();
		
		while(true) {
			str = bs.readLine();
			if (str == null) {
				break;
			}
			detail = str.split(",");
			System.out.println("이름: "+detail[0]+"\n핸드폰: "+detail[1]+"\n회사: "+detail[2]);
			
		}
//		bw.close();
		bs.close();
	}
	// 출력완료

}
