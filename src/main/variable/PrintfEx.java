package main.variable;

public class PrintfEx {
    public static void main(String[] args) {
        int i = 100;
        float f = 3.141592f;
        char c = 'A';
        String str = "Hello World~!";

        //%d = decimal
        System.out.printf("총점은 %d입니다. \n", i);
        //%f = float
        System.out.printf("PI의 값은 %10.7f입니다. %n", f);
        //%c = char
        System.out.printf("영어 대문자의 시작은 %c입니다", c);
        //%s = String
        System.out.printf("\"안녕 세상아~!\" = \"%s\" %n", str);
        System.out.printf("\"안녕 세상아~!\" = \"%15s\" %n", str);
        System.out.printf("\"안녕 세상아~!\" = \"%-15s\" %n", str);
    }
}
