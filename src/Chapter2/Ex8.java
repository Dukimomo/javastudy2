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
		
		// date 객체의 Year 필드 값은 2022로 바꿔라
		// date 객체가 갖고 있던 월, 일 값은 그대로 유지하고 YEAR 필드의 값만 2022로 바뀌는 것
		// year - 2022, month - date객체가 갖고 있던월, day - date객체가 갖고 있던 일 / 을 갖고 있는
		// 새로운 LocalDate 객체를 반환
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
		
//		System.out.println("시 : " + time.getHour());
//		System.out.println("문 : " + time.getMinute());
//		System.out.println("조 : " + time.getSecond());
//		LocalDate date = LocalDate.now();
		
//		System.out.println("올해 = " + date.getYear());
//		
//		System.out.println("이번 달 = " + date.getMonthValue);
//		S
	}

}
