package loop.condition;

import java.io.IOException;
import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            menu();
            System.out.print("메뉴 선택 : ");
            int menuChoice = scan.nextInt();
            switch (menuChoice) {
                case 1:
                    memberRegist();
                    String member = scan.nextLine();
                    break;
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("메뉴를 확인바랍니다");
                    continue;
            }
        } while (true);
    }
    private static void menu(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("회원관리 프로그램입니다. 메뉴를 입력하세요");
        System.out.println("1. 회원 등록");
        System.out.println("2. 회원 조회");
        System.out.println("3. 회원 수정");
        System.out.println("4. 회원 탈퇴");
        System.out.println("5. 종료");
    }
    private static void memberRegist(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("ȸ�� ���");
        System.out.println("1. �̸�");
        System.out.println("2. ��ȭ��ȣ");
        System.out.println("3. ���� �޴�");
         Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

    }
}
