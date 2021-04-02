package Chapter5;

public enum BirthMonth {
	Jan("1��"), Feb("2��"), Mar("3��"), Apr("4��"), May("5��"),
	Jun("6��"), Jul("7��"), Aug("8��"), Sep("9��"), Oct("10��"),
	Nov("11��"), Dec("12��");
	
	private final String korMonth;
	BirthMonth(String korMonth) {
		this.korMonth = korMonth;
	}
	
	public String getKormonth() {
		return korMonth;
	}
	
	// ����ڰ� xx���� �Է����� �� �ش��ϴ� �췯�� ����� ��ȯ�ϴ� �ż���
	public static BirthMonth getBirthMonth(String month) {
		BirthMonth[] birthMonthArr = BirthMonth.values();
		
		BirthMonth result = null;
		
		for(BirthMonth birthMonth : birthMonthArr) {
			// n��° ����� ���� �ִ� �������� XX�� ���ڿ��� ����
			String korMonth = birthMonth.getKormonth();
			
			if(month.equals(korMonth)) {
				System.out.println(birthMonth + "�� " + korMonth + "�Դϴ�.");			
			}
		} // end for
		
		return result;
	}
}
