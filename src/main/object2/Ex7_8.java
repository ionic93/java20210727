package main.object2;

public class Ex7_8 {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        Outer2.Inner inner = outer2.new Inner();
        inner.method1();
    }
}
class Outer2{
    int value = 10;

    class Inner{
        int value = 20;
        void method1(){
            int value = 30;

            System.out.println(value); //30이 나오게 출력
            System.out.println(this.value); //20이 나오게 출력
            System.out.println(Outer2.this.value); //10이 나오게 출력
            //외부 클래스의 인스턴스 변수는 내부클래스에서
            //외부 클래스이름.this.변수이름 으로 접근한다.
        }
    }//Inner class 끝
}//Outer클래스 끝
