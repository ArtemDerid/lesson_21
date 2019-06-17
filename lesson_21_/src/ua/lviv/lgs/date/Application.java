package ua.lviv.lgs.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Application {
	public static void main(String[] args) {

		Date date = new java.util.Date();

		LocalDate ld = convertToLocalDate(date);
		System.out.println(ld);

		LocalTime lc = convertToLocalTime(date);
		System.out.println(lc);

		LocalDateTime ldt = convertToLocalDateTime(date);
		System.out.println(ldt);

	}

	public static LocalDate convertToLocalDate(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public static LocalTime convertToLocalTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}

	public static LocalDateTime convertToLocalDateTime(Date dateToConvert) {
		return dateToConvert.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}

}
