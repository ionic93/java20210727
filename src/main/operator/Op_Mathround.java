package main.operator;

import java.util.Scanner;

public class Op_Mathround {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("소수를 입력하시오 : ");
        double input = scan.nextDouble();
        System.out.print("반올림 할 자리를 입력하시오");
        int digit = scan.nextInt();
        MyMath.digitRound(input, digit);
    }
}
