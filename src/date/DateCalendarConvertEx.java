package date;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarConvertEx {
    public static void main(String[] args) {
        Date d = new Date();
        Calendar cal = Calendar.getInstance();
        //Date => Calendar로
        cal.setTime(d);
        //Calendar => Date로
        Date date = new Date(cal.getTimeInMillis());
    }
}
