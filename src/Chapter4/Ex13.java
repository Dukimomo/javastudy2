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
		
		// set은 get 매서드가 존재하지 않음
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// foreach
		// 향상된 for문
		for(Integer i : set) {
			System.out.println(i);
		}
		
//		Set<Customer> customer = new HashSet<>();
//		
//		Customer customer1 = new Customer("012-345-6789", "현금");
//		Customer customer2 = new Customer("012-345-6789", "카드");
//		Customer customer3 = new Customer("012-345-6789", "카드");
//		Customer customer4 = new Customer("012-345-6789", "현금");
//		Customer customer5 = new Customer("012-345-6789", "현금");
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


