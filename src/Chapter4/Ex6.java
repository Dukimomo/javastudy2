package Chapter4;

import java.util.HashMap;
import java.util.Map;

public class Ex6 {
	public static void main(String[] args) {
		Passenger p1 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ��");
		Passenger p2 = new Passenger("ȫ�浿", "010-7591-8524", "���ڳ븶");
//		String a = "a";
//		String b = "a";
		// �� �ν��Ͻ��� �̸��� ����
//		String p1Name = p1.getName();
//		String p2Name = p2.getName();
////		boolean same = p1.getName().equals(p2.getName());
//		boolean nameSame = p1Name.equals(p2Name);
//		
//		// �� �ν��Ͻ��� ����ó�� ����
//		String p1Tel = p1.getTel();
//		String p2Tel = p2.getTel();
//		boolean telSame = p1Tel.equals(p2Tel);
//		
//		// �� �ν��Ͻ��� �¼������ ����
//		String p1Seat = p1.getSeat();
//		String p2Seat = p2.getSeat();
//		boolean SeatSame = p1Seat.equals(p2Seat);
//		
//		// �̸��� ����ó�� �¼���� ��� ���ٸ� true
//		if(nameSame && telSame && SeatSame) {
//			System.out.println("True");
//		} else {
//			System.out.println("False");
//		}
//		
		// �׷��� �ʴٸ� false
		boolean same = p1.hashCode() == p2.hashCode();
		if(same) {
			System.out.println("p1�� p2�� �����ϴ�");
		} else {
			System.out.println("p1�� p2�� �ٸ��ϴ�");
		}
		
		Map<String, String> hashMap = new HashMap<>();
		
		hashMap.put("ȫ�浿", "���ڳ��");
		hashMap.put("������ȣ", "�۽�Ʈ");
		hashMap.put("����", "����Ͻ�");
		hashMap.put("Ȳ����", "���ڳ��");
		hashMap.put("��ö��", "�۽�Ʈ");

	}

}
