package Chapter2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Ex8 {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalDate date = LocalDate.now();
		
		System.out.println(date.plusYears(1));
		System.out.println(date.plusMonths(5));
		System.out.println(date.plusDays(21));
		
		System.out.println(time.plusHours(2));
		
		// date ��ü�� Year �ʵ� ���� 2022�� �ٲ��
		// date ��ü�� ���� �ִ� ��, �� ���� �״�� �����ϰ� YEAR �ʵ��� ���� 2022�� �ٲ�� ��
		// year - 2022, month - date��ü�� ���� �ִ���, day - date��ü�� ���� �ִ� �� / �� ���� �ִ�
		// ���ο� LocalDate ��ü�� ��ȯ
//		LocalDate newDate = date.with(ChronoField.YEAR, 2022);
//		System.out.println(newDate);
//		
//		System.out.println(date.with(ChronoField.MONTH_OF_YEAR, 7));
//		
//		System.out.println(date.with(ChronoField.DAY_OF_MONTH, 21));
//		
//		System.out.println(time.with(ChronoField.HOUR_OF_DAY, 11));
//		
//		System.out.println(time.with(ChronoField.MINUTE_OF_HOUR, 38));
//		
//		System.out.println(time.with(ChronoField.SECOND_OF_MINUTE, 7));
		
//		System.out.println("�� : " + time.getHour());
//		System.out.println("�� : " + time.getMinute());
//		System.out.println("�� : " + time.getSecond());
//		LocalDate date = LocalDate.now();
		
//		System.out.println("���� = " + date.getYear());
//		
//		System.out.println("�̹� �� = " + date.getMonthValue);
//		S
	}

}
