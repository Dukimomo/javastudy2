package Chapter5;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		Gender[] genderArr = Gender.values();
		for (int i=0; i<genderArr.length; i++) {
			Gender gender = genderArr[i];
			System.out.println(genderArr[i]);
		}
		
		for(Gender gender : genderArr) {
			System.out.println(gender);
		}
		
		BirthMonth[] birthmonth = BirthMonth.values();
		
		for(BirthMonth birth: birthmonth) {
			System.out.println(birth);
		}
	}	
}
