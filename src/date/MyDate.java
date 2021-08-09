package date;

import java.util.Calendar;

public class MyDate {
    public static String twoDigit(int num) {
        return num < 10 ? "0" + num : num + "";
    }
    public static String getWeek(int week){
        String arr[] = {"","일","월","화","수","목","금","토"};
        return arr[week];
    }
    public static String getAmPm(int ap){
        return new String[]{"오전","오후"}[ap];
//        return ap==0?"오전":"오후";
    }
    //    public static void getTime(){
//        Calendar cal = Calendar.getInstance();
//        System.out.println(twoDigit(cal.get(Calendar.HOUR_OF_DAY))+"시"+twoDigit(cal.get(Calendar.MINUTE))+"분"+twoDigit(cal.get(Calendar.SECOND))+"초");
//    }
    public static String getTime(){
        Calendar cal = Calendar.getInstance();
        return twoDigit(cal.get(Calendar.HOUR_OF_DAY))+"시"+twoDigit(cal.get(Calendar.MINUTE))+"분"+twoDigit(cal.get(Calendar.SECOND))+"초";
    }
    public static String getDate(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR)+"-"+twoDigit(cal.get(Calendar.MONTH)+1)+"-"+ twoDigit(cal.get(Calendar.DATE));
    }
    public static String getToDay(Calendar cal){
        return cal.get(Calendar.YEAR)+"-"+twoDigit(cal.get(Calendar.MONTH)+1)+"-"+ twoDigit(cal.get(Calendar.DATE));
    }
    public static String getFullTime(){
        Calendar cal = Calendar.getInstance();
        return getDate()+" "+getAmPm(cal.get(Calendar.AM_PM))+" "+getTime();
    }
}
