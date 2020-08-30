package date.newapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		String dataNascimento = "14/07/1990 14:30:20";
		LocalDateTime ldt = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime now = LocalDateTime.now();
		
		Duration d = Duration.between(ldt, now);
		System.out.println("Horas: " + d.toHours());
		System.out.println("Dias: " + d.toDays());
		
		Period p = Period.between(ldt.toLocalDate(),now.toLocalDate());
		System.out.println("Meses : " + p.toTotalMonths());
		
		System.out.println("Semanas : " + ChronoUnit.WEEKS.between(ldt, now));
		System.out.println("Anos : " + ChronoUnit.YEARS.between(ldt, now));
	
		YearMonth ym = YearMonth.of(2020, 10);
		System.out.println(ym);
		
		Month month = Month.of(12);
		System.out.println(month);
		
		LocalDate ld = LocalDate.now();
		ld =  ld.plusMonths(4);
		System.out.println(ld);
		ld = ld.plusYears(1);
		System.out.println(ld);
	}

}
