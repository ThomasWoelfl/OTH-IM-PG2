package uebung_10_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class ConsoleClock {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE', 'dd. MMMM yyyy HH:mm:ss z");
		dateFormat.setTimeZone(timeZone);
		
		while (true) {
			System.out.println(dateFormat.format(new Date()));
			try {
				TimeUnit.SECONDS.sleep(1);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
