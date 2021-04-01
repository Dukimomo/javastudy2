package Chapter4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
	public static void main(String[] args) {
		// ArrayList, LinkedList, stack, vector ...
		// ArrayList Ư¡ - �߰��� ����, ������ ����� ��Ȳ������ �������� �ڷᱸ��
		//				   �� �ڿ��� ����, ������ ����� ��Ȳ������ ������ �ڷᱸ��
		List<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("D");
		System.out.println("�ʱ� ���� : " + arrayList);
		
		arrayList.add(1, "B");
		System.out.println("�ε��� 1 ��ġ�� B �߰� : " + arrayList);
		
		arrayList.add(3, "D"); 
		System.out.println("�ε��� 3 ��ġ�� D �߰� : " + arrayList);
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
		
		
		Passenger passenger1 = new Passenger("ȫ�浿", "010-1473-3698", "���ڳ��");
		Passenger passenger2 = new Passenger("ȫ���", "010-1573-3698", "���ڳ��");
		Passenger passenger3 = new Passenger("ȫ���", "010-1673-3698", "���ڳ��");
		Passenger passenger4 = new Passenger("ȫ���", "010-1773-3698", "���ڳ��");
		Passenger passenger5 = new Passenger("ȫ���", "010-1873-3698", "���ڳ��");
		Passenger passengerX = new Passenger("��Ʃ", "010-7591-1534", "���ڳ��");
		
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
		System.out.println("�� = " + passengerList);
		
		Passenger suspect1 = passengerList.get(1);
		System.out.println(suspect1);
		System.out.println(suspect1.getName());
		System.out.println(suspect1.getTel());
		System.out.println(suspect1.getSeat());
		
		Passenger suspect2 = passengerList.get(2);
		System.out.println(suspect2.getName());
		System.out.println(suspect2.getTel());
		System.out.println(suspect2.getSeat());
		
		
		// ����ֳ���? -> true / �׷��� ������ false
		System.out.println(passengerList.isEmpty());
		
		// �÷��� �����ӿ�ũ�� ����ִ� �������� ������ ��ȯ
		System.out.println(passengerList.size());
		
		// i�� 0�� �����ؼ� 2�� ������.
		for(int i=0; i<passengerList.size(); i++) {
			System.out.println(passengerList.get(i));
		}
		
		// ���� for�� / foreach��
		for(Passenger p : passengerList) {
			System.out.println(p);
		} // end for
		
		int[] arr = {1, 2, 3, 4, 5};
		for(int i : arr) {
			System.out.println(i);
		} 
		
		arrayList.remove(2);
		System.out.println("�ε��� 2 ��ġ�� �� ���� : " + arrayList);
		arrayList.remove(4);
		System.out.println("�ε��� 4 ��ġ�� �� ���� : " + arrayList);
		
		System.out.println("�ε��� 2 ��ġ�� �� ��ȯ : " + arrayList.get(2));
		System.out.println("�ε��� 2 ��ġ�� �� ��ȯ : " + arrayList.get(3));
	
//		List<Passenger> passengerList = new ArrayList<>();
	}
}