package chapter8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex5 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\output.txt", true); // true ���� �� �����̱Ⱑ ��
			// �ش� ��Ʈ���� ����� ���Ͽ� a ~ z ���� �����ϼ���
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
