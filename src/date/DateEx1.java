package date;

import java.util.Calendar;

public class DateEx1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR)); //년 표시
        System.out.println(cal.get(Calendar.MONTH)+1);// 달 표시
        System.out.println(cal.get(Calendar.DATE)); //일 표시
        //요일은 1~7까지 1:일요일
        System.out.println("오늘의 요일: "+cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(MyDate.getWeek(cal.get(Calendar.DAY_OF_WEEK))+"요일");
        System.out.println("이번달의 일: "+cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("이번달의 주: "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(MyDate.getAmPm(cal.get(Calendar.AM_PM))); //오전,오후 표시
        System.out.println(cal.get(Calendar.HOUR)); //시
        System.out.println(cal.get(Calendar.MINUTE)); //분
        System.out.println(cal.get(Calendar.SECOND)); //초
        System.out.println(MyDate.getTime());
        System.out.println(MyDate.getFullTime());
    }
}
