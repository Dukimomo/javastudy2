package Chapter5;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("©Ы ют╥б : ");
		String month = scanf.next();
		
		BirthMonth birthMonth = BirthMonth.getBirthMonth(month);
	}
}


