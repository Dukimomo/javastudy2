package Chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		// ArrayList, LinkedList, stack, vector ...
		// ArrayList 특징 - 중간에 삽입, 삭제가 빈번한 상황에서는 부적합한 자료구조
		//				   맨 뒤에서 삽입, 삭제가 빈번한 상황에서는 적합한 자료구조
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");
		System.out.println("초기 상태 : " + arrayList);
		
		arrayList.add(1, "B");
		System.out.println("인덱스 1 위치에 B 추가 : " + arrayList);
		
		arrayList.add(3, "D"); 
		System.out.println("인덱스 3 위치에 D 추가 : " + arrayList);
//		arrayList = new LinkedList<>();
//		
//		ArrayList<String> arrList = new ArrayList<>();
//		arrList = new LinkedList<>();
		List<Integer> allayList = new ArrayList<>();
		allayList.add(1);
		allayList.add(2);
		allayList.add(3);
		allayList.add(4);
		allayList.add(5);
		allayList.add(6);
		allayList.add(7);
		allayList.add(8);
		allayList.add(9);
		allayList.add(10);
		
		
		Passenger passenger1 = new Passenger("홍길동", "010-1473-3698", "이코노미");
		Passenger passenger2 = new Passenger("홍길딩", "010-1573-3698", "이코노미");
		Passenger passenger3 = new Passenger("홍길등", "010-1673-3698", "이코노미");
		Passenger passenger4 = new Passenger("홍길당", "010-1773-3698", "이코노미");
		Passenger passenger5 = new Passenger("홍길똥", "010-1873-3698", "이코노미");
		Passenger passengerX = new Passenger("메튜", "010-7591-1534", "이코노미");
		
		List<Passenger> passengerList = new ArrayList<>();
		Iterator<Passenger> it = passengerList.iterator();
		while(it.hasNext()) {
			Passenger p1 = it.next();
			System.out.println(p1.getName());
			System.out.println(p1.getTel());
			System.out.println(p1.getSeat());
		}
		
		passengerList.add(passenger1);
		passengerList.add(passenger2);
		passengerList.add(passenger3);
		passengerList.add(passenger4);
		passengerList.add(passenger5);
		passengerList.add(0, passengerX);
		passengerList.remove(1);
		System.out.println("전 = " + passengerList);
		
		Passenger suspect1 = passengerList.get(1);
		System.out.println(suspect1);
		System.out.println(suspect1.getName());
		System.out.println(suspect1.getTel());
		System.out.println(suspect1.getSeat());
		
		Passenger suspect2 = passengerList.get(2);
		System.out.println(suspect2.getName());
		System.out.println(suspect2.getTel());
		System.out.println(suspect2.getSeat());
		
		
		// 비어있나요? -> true / 그렇지 않으면 false
		System.out.println(passengerList.isEmpty());
		
		// 컬랙션 프레임워크에 들어있는 데이터의 개수를 반환
		System.out.println(passengerList.size());
		
		// i가 0로 시작해서 2로 끝난다.
		for(int i=0; i<passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
		// 향상된 for문 / foreach문
		for(Passenger p : passengerList) {
			System.out.println(p);
		} // end for
		
		int[] arr = {1, 2, 3, 4, 5};
		for(int i : arr) {
			System.out.println(i);
		} 
		
		arrayList.remove(2);
		System.out.println("인덱스 2 위치의 값 삭제 : " + arrayList);
		arrayList.remove(4);
		System.out.println("인덱스 4 위치의 값 삭제 : " + arrayList);
		
		System.out.println("인덱스 2 위치의 값 반환 : " + arrayList.get(2));
		System.out.println("인덱스 2 위치의 값 반환 : " + arrayList.get(3));
	
//		List<Passenger> passengerList = new ArrayList<>();
	}
}