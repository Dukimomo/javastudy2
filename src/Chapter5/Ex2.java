package Chapter5;

public class Ex2 {

	public static void main(String[] args) {
		String birth = "Jan";
		
		// �Ű������� ����� �̸��� �����ؼ�
		// �Ű������� ���޹��� �̸��� ���� �ִ� ����� ã�� �� ����
		try {
			BirthMonth birthMonth = BirthMonth.valueOf(birth);
			System.out.println(birthMonth + " = " + birthMonth.getKormonth());
		} catch(IllegalArgumentException e) {
			System.out.println("�������� �ʴ� ����Դϴ�");
		}
		BirthMonth[] birthMonthArr = BirthMonth.values();
		
		for(BirthMonth birthMonth : birthMonthArr) {
			System.out.println(birthMonth + " = " + birthMonth.getKormonth());
		}
		
		
	}
}


