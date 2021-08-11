package main.operator;

import java.util.Scanner;

public class Op_Math {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("전체 갯수를 입력하시오");
        int ea = scan.nextInt();
        System.out.println("담을 바구니의 크기를 입력하시오");
        int basket = scan.nextInt();
//        int basket_num = ea/basket+(ea%basket>0?1:0); //나머지 연산자와 삼항 연산자 이용
        int basket_num = (int)Math.ceil(ea/(float)basket); //float 형변환과 ceil(절상)을 이용

        System.out.printf("전체개수 : %d/ 바구니수 : %d", ea, basket_num);
    }
}
