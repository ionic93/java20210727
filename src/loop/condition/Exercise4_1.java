package loop.condition;

public class Exercise4_1 {
    public static void main(String[] args) {
        //4-1
        int x = 15;
        char ch = 'A';
        int year = 500;
        boolean powerOn = false;
        String str = "yes";
        // int x가 10보다 크고 20보다 작을 때 true
        System.out.println(x>10&&x<20);
        // char ch가 공백이나 탭이 아닐때 true
        System.out.println(!(ch==' '|| ch=='\t'));
        // char ch가 'x' 또는 'X'일때 true
        System.out.println(ch>='x'|| ch<='X');
        // char ch가 숫자(0~9)일때 true
        System.out.println(ch>='0' && ch<='9');
        // char ch가 영문자(소문자,대문자)일때 true
        System.out.println((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'));
        // int year가 400으로 나눠떨어지거나 또는 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을때 true
        System.out.println(year%400==0 || year%4==0 && year%100 !=0);
        //boolean 변수 powerOn이 false일때 true
        System.out.println(!powerOn);
        //문자열 참조변수 str이 "yes"일때 true
        System.out.println(str.equals("yes"));

        //4-2 2또는 3의 배수가 아닌 수의 총합 (1~20)
        int sum=0;
        for (int i = 0; i < 20; i++) {
            if(i%2!=0 && i%3!=0)
                sum+=i;
        }
        System.out.printf("4-2합계: %2d",sum);
        System.out.println();
        
        //4-3 1+(1+2)+(1+2+3)+---(1+2+--+10)의 결과를 계산
        int sum2=0;
        int total=0;
        for (int i = 0; i <=10; i++) {
            sum2 +=i;
            total +=sum2;
        }
        System.out.println("4-3답:"+total);

        //4-4 1+(-2)+3+(-4)+--- 이럴때 총합이 100이상이 되는 구간을 정하시오
        int total4 = 0;
        int z = 1;
        while(true) {
            total4 += (z%2==0?-z:z);
            z++;
            if(total4>=100) break;
        }
        System.out.println("4-4 100이상이 되는 구간: "+z);

        //4-5
        System.out.println("============");
        int y=0;
        while (y <= 10) {
            int j=0;
            while (j <= y) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            y++;
        }
        System.out.println("============");
        //4-6 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <=6 ; j++) {
                if(i+j==6)
                    System.out.println(i+"+"+j+"="+(i+j));
            }
        }
    }
}
