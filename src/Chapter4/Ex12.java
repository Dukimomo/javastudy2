package Chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Customer> hashSwan = new HashMap<>();
		
		Customer customer1 = new Customer("012-345-6789", "����");
		Customer customer2 = new Customer("012-345-6789", "ī��");
		Customer customer3 = new Customer("012-345-6789", "ī��");
		Customer customer4 = new Customer("012-345-6789", "����");
		Customer customer5 = new Customer("012-345-6789", "����");
//		classOneKor.put("ȫ�浿", 95);
//		classOneKor.put("��ö��", 18);
//		classOneKor.put("����", 86);
//		classOneKor.put("������ȣ", 36);
//		classOneKor.put("Ȳ����", 69);
		
		hashSwan.put("ȫ�浿", customer1);
		hashSwan.put("ȫ�浿", customer2);
		hashSwan.put("ȫ�浿", customer3);
		hashSwan.put("ȫ�浿", customer4);
		hashSwan.put("ȫ�浿", customer5);
		
		Set<String> keySet = hashSwan.keySet();
		for (String key : keySet) {
			Customer c = hashSwan.get(key);
			System.out.println(c.getTel());
			System.out.println(c.getPaymentMethod());
		}
	}

}
