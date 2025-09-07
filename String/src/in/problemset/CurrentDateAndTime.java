package in.problemset;

import java.util.Calendar;
// another method
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println("current date and time is: ");
		
		System.out.format("%tB %te, %tY%n", c, c, c);
		
		System.out.format("%tl:%tM %tp%n", c, c, c); 
		
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current Date and Time: " + now.format(formatter));

	}

}
