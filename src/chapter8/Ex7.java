package chapter8;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex7 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bps = null;
		
		try {
			// ��� ��Ʈ��
			fos = new FileOutputStream("C:\\Users\\ITPS\\Desktop\\bos.txt");
			// ��� ��Ʈ���� ���� ��Ʈ���� ����
			// ������ �⺻ ������� 8KB
			// ������ ����� 5����Ʈ�� ����
            bps = new BufferedOutputStream(fos, 5);
			
			for(char i='1'; i<='9'; i++) {
				bps.write(i);
			}	
			
			bps.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
			try {
				// ������Ʈ���� ������
				// ������Ʈ���� ����� ��� ��Ʈ���� �ڵ����� ������.
				fos.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
