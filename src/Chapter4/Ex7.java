package Chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		// 저장하는 데이터의 순서를 보장하지는 않음
		Set<Integer> hashSet = new HashSet<>();
		// 정수가 절대 아님
		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(5);
		hashSet.add(7);
		System.out.println("조기 상태 : " + hashSet);
		
		hashSet.add(1);
		System.out.println("요소 1을 추가 : " + hashSet);
		
		boolean isAdd = hashSet.add(7);
		if(isAdd) {
			System.out.println("요소 7을 추가 : " + hashSet);
		}
		
		isAdd = hashSet.add(9);
		if(isAdd) {
			System.out.println("요소 9를 추가 : " + hashSet);
		}
//		Set<String> lyricsSet = new HashSet<>();
//		while(true) {
//			System.out.println("노래 가사를 입력하세요. (종료 : -1) : ");
//			
//			String lyrics = scanf.next();
//			if(lyrics.equals("-1")) {
//				break;
//			}
//			
//			if(lyricsSet.add(lyrics)) {
//				
//			} else {
//				System.out.println("이미 입력된 가사입니다 => " + lyrics);
//			} 
//			
//			System.out.println();
//		}// end while
		
		hashSet.remove(1);
		System.out.println("요소 1을 삭제 : " + hashSet);
		
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Integer el = iterator.next();
			
			System.out.println(el);
		}
	}
}
