package java8.datetimes;

import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;

public class DateTimeDemos
{ public static void main(String args[])
	{
	   LocalDate date1=LocalDate.now();
	   System.out.println(date1);
	   System.out.println("date time infoermations");
	   System.out.println(date1.getDayOfWeek());
	   System.out.println(date1.getDayOfMonth());
	   System.out.println(date1.getDayOfYear());
	   System.out.println(date1.getMonth());   
	   System.out.println(date1.isLeapYear());
	   System.out.println(date1.plusMonths(1));
	   System.out.println(date1.minusYears(2));  
	   LocalDate date2 = LocalDate.of(1947, 8, 15);
	   System.out.println(date2);
	   
	   LocalDate date3=LocalDate.parse("2023-01-01");
	   System.out.print(date3);
	  DateTimeFormatter myFormat =  DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	  String formattedDate = date3.format(myFormat);
	  System.out.print(formattedDate);
	  DateTimeFormatter userFormat= DateTimeFormatter.ofPattern("yy|MM|dd");
	  String UserFormatDate = date3.format(userFormat);
	  System.out.print(userFormat);
	  
	}

}
