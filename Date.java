package endProject;

import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Date {

	public static String getTime(int x) {

		LocalDate today = LocalDate.now();
		TemporalField fieldISO = WeekFields.of(Locale.FRANCE).dayOfWeek();
		
		LocalDate date = today.with(fieldISO, x);

		String dateString = date.toString();
		return dateString;

	}
}