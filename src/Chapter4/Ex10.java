package Chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		Set<Passenger> passengerList = new HashSet<>();
		
		Passenger p1 = new Passenger("ȫ�浿", "010-1473-3698", "���ڳ��");
		Passenger p2 = new Passenger("��ö��", "010-1473-3698", "�۽�Ʈ");
		Passenger p3 = new Passenger("����", "010-1473-3698", "����Ͻ�");
		Passenger p4 = new Passenger("������ȣ", "010-1473-3698", "�۽�Ʈ");
		Passenger p5 = new Passenger("Ȳ����", "010-1473-3698", "���ڳ��");
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		passengerList.add(p4);
		passengerList.add(p5);
		
		// Iterator�� ����ؼ� ��� �°��� ������ ����ϼ���.
		
//		Iterator<Passenger> iterator = passengerList.iterator();
//		while(iterator.hasNext()) {
//			Passenger passenger = iterator.next();
//			
//			System.out.println("�̸� : " + passenger.getName());
//			System.out.println("�̸� : " + passenger.getTel());
//			System.out.println("�̸� : " + passenger.getSeat()); 
		
		System.out.println(c.getTel());
		System.out.println();
		}
	}

