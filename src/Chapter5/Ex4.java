package Chapter5;

public class Ex4 {

	public static void main(String[] args) {
		int genderValue = 2;
		
		Gender gender = Gender.getGender(genderValue);
//		System.out.println(gender);
		switch(gender) {
			case MALE:		
				System.out.println("남성을 위한 쿠폰 지급");
				break;
			case FEMALE:
				System.out.println("여성을 위한 쿠폰 지급");
				break;
		}
	}

}
