package main.variable;

public class Ex01 {
    public static void main(String[] args) {
        //2-7번 문제
        System.out.println("1" + "2");
        System.out.println(true + "");
        System.out.println('A' + 'B');
        System.out.println('1' + 2);
        System.out.println('1' + '2');
        System.out.println('J' + "ava");
//        System.out.println(true + null); 오류발생
        System.out.println(true+""+null);

        //2-8번 문제
        int x = 1;
        int y = 2;
        int z = 3;
        int tmp = x;
        x=y;
        y=z;
        z=tmp;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
