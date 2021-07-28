package operator;

import java.util.Scanner;

public class Op_Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ID 입력:");
        String id = scan.nextLine();
        System.out.print("Pass 입력:");
        String pass = scan.nextLine();
        //id=root, pass=1234 라고 가정
        if (id.equalsIgnoreCase("root")) {
            if (pass.equals("1234")) {
                System.out.println("로그인 되었습니다");
            } else {
                System.out.println("비밀번호가 다릅니다");
            }
        } else {
            System.out.println("아이디가 다릅니다");
        }
    }
}
