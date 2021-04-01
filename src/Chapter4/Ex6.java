package Chapter4;

import java.util.HashMap;
import java.util.Map;

public class Ex6 {
	public static void main(String[] args) {
		Passenger p1 = new Passenger("홍길동", "010-7591-8524", "이코노미");
		Passenger p2 = new Passenger("홍길동", "010-7591-8524", "이코노마");
//		String a = "a";
//		String b = "a";
		// 두 인스턴스의 이름이 같다
//		String p1Name = p1.getName();
//		String p2Name = p2.getName();
////		boolean same = p1.getName().equals(p2.getName());
//		boolean nameSame = p1Name.equals(p2Name);
//		
//		// 두 인스턴스의 연락처가 같다
//		String p1Tel = p1.getTel();
//		String p2Tel = p2.getTel();
//		boolean telSame = p1Tel.equals(p2Tel);
//		
//		// 두 인스턴스의 좌석등급이 같다
//		String p1Seat = p1.getSeat();
//		String p2Seat = p2.getSeat();
//		boolean SeatSame = p1Seat.equals(p2Seat);
//		
//		// 이름과 연락처와 좌석등급 모두 같다면 true
//		if(nameSame && telSame && SeatSame) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//		
		// 그렇지 않다면 false
		boolean same = p1.hashCode() == p2.hashCode();
		if(same) {
			System.out.println("p1과 p2가 같습니다");
		} else {
			System.out.println("p1과 p2가 다릅니다");
		}
		
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("홍길동", "이코노미");
		hashMap.put("유노윤호", "퍼스트");
		hashMap.put("고영희", "비즈니스");
		hashMap.put("황광희", "이코노미");
		hashMap.put("김철수", "퍼스트");

	}

}
