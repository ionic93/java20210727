package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        for (int i = 0; i < 12; i++) {
            cal.set(2020,i,1); //2020 각 월 1일로 설정
            int weekday = cal.get(Calendar.DAY_OF_WEEK); //각 1일의 요일을 알아내기 1:일요일 ~ 7:토요일
            int secondDay = weekday==1? weekday+7:16-weekday; // 2번째 일요일은 1일이 일요일경우 8일, 나머지 요일일경우 16-Day_OF_WEEK로 빼면 나옴
            cal.set(2020,i,secondDay); // 각 월의 2번째 일요일로 캘린더 설정

            Date d = cal.getTime(); //Calendar를 Date로 변환 -> SimpleDateFormat은 Date로 값을 넣어야하므로
            System.out.println(new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
        }
    }
}
