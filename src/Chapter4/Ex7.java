package Chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		// �����ϴ� �������� ������ ���������� ����
		Set<Integer> hashSet = new HashSet<>();
		// ������ ���� �ƴ�
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(5);
		hashSet.add(7);
		System.out.println("���� ���� : " + hashSet);
		
		hashSet.add(1);
		System.out.println("��� 1�� �߰� : " + hashSet);
		
		boolean isAdd = hashSet.add(7);
		if(isAdd) {
			System.out.println("��� 7�� �߰� : " + hashSet);
		}
		
		isAdd = hashSet.add(9);
		if(isAdd) {
			System.out.println("��� 9�� �߰� : " + hashSet);
		}
//		Set<String> lyricsSet = new HashSet<>();
//		while(true) {
//			System.out.println("�뷡 ���縦 �Է��ϼ���. (���� : -1) : ");
//			
//			String lyrics = scanf.next();
//			if(lyrics.equals("-1")) {
//				break;
//			}
//			
//			if(lyricsSet.add(lyrics)) {
//				
//			} else {
//				System.out.println("�̹� �Էµ� �����Դϴ� => " + lyrics);
//			} 
//			
//			System.out.println();
//		}// end while
		
		hashSet.remove(1);
		System.out.println("��� 1�� ���� : " + hashSet);
		
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Integer el = iterator.next();
			
			System.out.println(el);
		}
	}
}
