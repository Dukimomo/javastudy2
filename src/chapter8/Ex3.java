package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		// 인자를 문자열로 전달해주면 인자로 전달 받은 겯ㅇ로에 있는 파일과 스트림을 연결
		// 절대경로 : 최상위 경로를 폿함한 파일의 위치 / 최상위 경로부터 해탕 위치까지 파일을 찾음
		// 상대경로 : 최상위 경로를 생략한 파일의 위치 / 현재 프로그램이 실행되는 해당 위치까지 파일을 찾음	
		
		FileInputStream fis = null;
		
		try {
//			 = new ("C:\\Users\\ITPS\\Desktop\\test.txt");
			fis = new FileInputStream("C:\\Users\\ITPS\\eclipse-workspace\\2021-03-29\\src\\chapter8\\Ex4.java");
			
			while(true) {
				int data = fis.read();
				if(data == -1) {
					break;
				}
				
				char c = (char) data;
				System.out.print(c);
			}
			
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			System.out.println("스트림을 닫는 도중 문제가 발생했습니다.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("프로그램 끝");	
	}

}
