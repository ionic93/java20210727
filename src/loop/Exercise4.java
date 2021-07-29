package loop;

public class Exercise4 {
    public static void main(String[] args) {
        //4-2 2또는 3의 배수가 아닌 수의 총합 (1~20)
        int sum=0;
        for (int i = 0; i < 20; i++) {
            if(i%2!=0 && i%3!=0)
                sum+=i;
        }
        System.out.printf("합계: %2d",sum);
        System.out.println();
        
        //4-3 1+(1+2)+(1+2+3)+---(1+2+---10)의 결과를 계산
        int sum2=0;
        int total=0;
        for (int i = 0; i <=10; i++) {
            sum2 +=i;
            total +=sum2;
        }
        System.out.println(total);

        //4-4 1+(-2)+3+(-4)+--- 이럴때 총합이 100이상이 되는 구간을 정하시오
        int sum3=0;
        int s= -1;
        int num=0;

        for (int i = 0; true; i++, s=-s) {
            num = s*i;
            sum3 += num;

            if (sum3>=100)
                break;
        }
        System.out.println("구간: "+num);
        System.out.println("총합: "+sum3);

        //4-6 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <=6 ; j++) {
                if(i+j==6)
                    System.out.println(i+"+"+j+"="+(i+j));
            }
        }
    }
}
