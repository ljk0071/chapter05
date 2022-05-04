package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\JavaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("안녕하세요");
		bw.newLine();
		bw.write("반갑습니다");
		bw.newLine();
		bw.write("고마워요");
		bw.newLine();
		bw.write("하이");
		
		bw.close();
		
	}

}
