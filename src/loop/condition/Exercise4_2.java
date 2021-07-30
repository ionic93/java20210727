package loop.condition;

public class Exercise4_2 {
    public static void main(String[] args) {
        //4-7 숫자로 된 문자열이 있을때 각 자리의 합을 더하는 코드
        String str = "12345";
        int sum = 0;

        for (int i = 0; i <str.length() ; i++) {
            sum+=str.charAt(i)-'0';
        }
        System.out.println("sum=" + sum);

        // 4-8 1~6사이의 임의의 정수를 value값에 저장
        int value = (int)(Math.random()*6)+1;
        System.out.println("value:"+value);

        //4-9 int num에 있는 숫자의 각 자리의 합을 더하는 코드
        int num = 12345;
        int sum1=0;
        while (num > 0) {
            sum1 += num%10;
            num /= 10;
        }
        System.out.println("sum1="+sum1);
    }

}
