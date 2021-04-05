package chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex3 {
	public static void main(String[] args) {
		// ���ڸ� ���ڿ��� �������ָ� ���ڷ� ���� ���� �ष�ο� �ִ� ���ϰ� ��Ʈ���� ����
		// ������ : �ֻ��� ��θ� ������ ������ ��ġ / �ֻ��� ��κ��� ���� ��ġ���� ������ ã��
		// ����� : �ֻ��� ��θ� ������ ������ ��ġ / ���� ���α׷��� ����Ǵ� �ش� ��ġ���� ������ ã��	
		
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
			System.out.println("������ ã�� ���߽��ϴ�.");
		} catch (IOException e) {
			System.out.println("��Ʈ���� �ݴ� ���� ������ �߻��߽��ϴ�.");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("���α׷� ��");	
	}

}
