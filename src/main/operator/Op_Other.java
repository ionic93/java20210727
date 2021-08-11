package main.operator;

public class Op_Other {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(x>>2); //1 x>>숫자: 0100 2번 : 2진수로 만든후 아래로 숫자만큼 민다 ->0001
        System.out.println(x<<1); //8 x<<숫자: 0100 1번 : 2진수로 만든후 위로 숫자만큼 민다. -> 1000
        System.out.println(x&2); //0  x&숫자 : 0100 0010 : x와 숫자를 2진수로 만든후 자릿수가 둘다 1일때만 1이고 나머지는 0이다 ->0000
        System.out.println(x^2); //6  x^숫자 : 0100 0010 : x와 숫자를 전부 2진수로 만든후 각 자릿수가 똑같으면 0, 다르면 1을 출력한다.->0110
        System.out.println(~x); //-5
        System.out.println(x|2); //6
        System.out.println(x *=10 + 5); //x = x * (10+5)
        int y =2;
        int z=5;
        char c='A';
        System.out.println(c);
    }
}
