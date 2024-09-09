package frLops;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {

	public static void main(String[]args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
	}
}
