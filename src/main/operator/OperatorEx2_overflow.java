package main.operator;

public class OperatorEx2_overflow {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 2000000;
        long l = 2000000L;
        long c = a * (long)b;
        long d = a * l;
        System.out.println(c); //적어도 하나는 형변환을 해줘야 값이 제대로 나온다
        System.out.println(d);
    }
}
