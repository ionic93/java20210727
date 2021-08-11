package main.date;

import java.util.Calendar;

public class CalendarSetEx {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2021,1,1);
        System.out.println(cal.getActualMaximum(Calendar.DATE));

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2021,7,9);
        long diff = cal2.getTimeInMillis() - cal.getTimeInMillis();
        System.out.println(diff/(1000*60*60*24)); //1000으로 나누고 *60 = 분, *60*60 = 시, *60*60*24 = 일

        cal2.add(Calendar.DATE,-5);
        System.out.println(MyDate.getToDay(cal2));
    }
}
