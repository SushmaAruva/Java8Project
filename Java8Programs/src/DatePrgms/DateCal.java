package DatePrgms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCal {

	public static void main(String[] args) {
		String val = "2 - 3";
		System.out.println(getDatesFrmDays(val));
	}

	private static String getDatesFrmDays(String inputDays) {
		String finalDates = null;
		try {
			int days = Integer.parseInt(inputDays.substring(0, 2).trim());
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = new Date();
			System.out.println("Current Date " + formatter.format(date.getTime()));
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.DATE, days);
			System.out.println("Current Date plus days " + formatter.format(c.getTime()));
			finalDates = formatter.format(c.getTime());
			c.add(Calendar.DATE, 1);
			System.out.println("Cal Date next day " + formatter.format(c.getTime()));
			finalDates = finalDates + " - " + formatter.format(c.getTime());
		} catch (Exception e) {
			return inputDays;
		}
		return (null != finalDates ? finalDates : inputDays);
	}
}