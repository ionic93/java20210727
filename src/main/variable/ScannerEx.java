package main.variable;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //System.in = 키보드
        int rand = (int)(Math.random()*100)+1;
        System.out.println("숫자를 맞추어 보세요(1~100)"); //System.out = 화면
        while (true) {
            int answer; //int를 입력받을때 nextInt()를 사용
            try {
                answer = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                System.out.println("숫자를 입력주세요");
                continue;
            }
            if (answer > rand) {
                System.out.println("큽니다");
            } else if (answer < rand) {
                System.out.println("작습니다");
            } else{
                System.out.println("정답입니다");
                break;
            }
        }

    }
}
