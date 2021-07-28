package operator;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("글자를 입력하세요");

        String input = scanner.nextLine();
        char ch = ' ';
        boolean number = true;
        for (int i = 0; i < input.length(); i++) {
            ch=input.charAt(i);
            if (ch > '9') {
                number = false;
                break;
            }
        }
        if(number){
            System.out.println("숫자입니다");
        } else{
            System.out.println("숫자가 아닙니다");
        }
    }

}
