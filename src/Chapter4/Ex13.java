package Chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex13 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		// set�� get �ż��尡 �������� ����
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// foreach
		// ���� for��
		for(Integer i : set) {
			System.out.println(i);
		}
		
//		Set<Customer> customer = new HashSet<>();
//		
//		Customer customer1 = new Customer("012-345-6789", "����");
//		Customer customer2 = new Customer("012-345-6789", "ī��");
//		Customer customer3 = new Customer("012-345-6789", "ī��");
//		Customer customer4 = new Customer("012-345-6789", "����");
//		Customer customer5 = new Customer("012-345-6789", "����");
//		
//		customer.add(customer1);
//		customer.add(customer2);
//		customer.add(customer3);
//		customer.add(customer4);
//		customer.add(customer5);
//		
//		for(Customer i : customer) {
//			System.out.println(i.getTel() + ',' +  i.getPaymentMethod());
		
		
		}
	}


