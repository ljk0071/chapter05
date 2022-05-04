package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) throws IOException{
		
		InputStream is = new FileInputStream("C:\\JavaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader bs = new BufferedReader(isr);
		OutputStream os = new FileOutputStream("C:\\JavaStudy\\file\\PhoneDB-copy.txt");
		OutputStreamWriter osr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osr);
		String[] detail;
		String str;
		List<String> dl = new ArrayList<String>();
		
		while(true) {
			str = bs.readLine();
			if (str == null) {
				str = "유재석,010-5555-5555,02-7552-9994";
				dl.add(str);
				for(int i=0;i<dl.size();i++) {
					bw.write(dl.get(i));
					bw.newLine();
				}
				break;
			}
			detail = str.split(",");
			dl.add(str);
			System.out.println("이름: "+detail[0]+"\n핸드폰: "+detail[1]+"\n회사: "+detail[2]+"\n");
		}
		bw.close();
		bs.close();
	}
	// 출력완료후 새 정보 추가

}
