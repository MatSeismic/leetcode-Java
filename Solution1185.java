
/** 1185. Day of the Week */

import java.util.Calendar;
import java.util.GregorianCalendar;

class Solution1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar c1 = new GregorianCalendar(year, month - 1, day);
        int idx = c1.get(Calendar.DAY_OF_WEEK);

        String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday" };
        return strDays[idx - 1];
    }
}