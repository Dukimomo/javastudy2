package chapter8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\output.txt", true); // true 설정 시 덧붙이기가 됨
			// 해당 스트림과 연결된 파일에 a ~ z 까지 저장하세요
			for(byte i='a'; i<='z'; i++) {
				fos.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} // end try
		} // end try
		
	} 

}
