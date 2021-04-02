package Chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Customer> hashSwan = new HashMap<>();
		
		Customer customer1 = new Customer("012-345-6789", "Çö±Ý");
		Customer customer2 = new Customer("012-345-6789", "Ä«µå");
		Customer customer3 = new Customer("012-345-6789", "Ä«µå");
		Customer customer4 = new Customer("012-345-6789", "Çö±Ý");
		Customer customer5 = new Customer("012-345-6789", "Çö±Ý");
//		classOneKor.put("È«±æµ¿", 95);
//		classOneKor.put("±èÃ¶¼ö", 18);
//		classOneKor.put("°í¿µÈñ", 86);
//		classOneKor.put("À¯³ëÀ±È£", 36);
//		classOneKor.put("È²±¤Èñ", 69);
		
		hashSwan.put("È«±æµ¿", customer1);
		hashSwan.put("È«±æµ¿", customer2);
		hashSwan.put("È«±æµ¿", customer3);
		hashSwan.put("È«±æµ¿", customer4);
		hashSwan.put("È«±æµ¿", customer5);
		
		Set<String> keySet = hashSwan.keySet();
		for (String key : keySet) {
			Customer c = hashSwan.get(key);
			System.out.println(c.getTel());
			System.out.println(c.getPaymentMethod());
		}
	}

}
