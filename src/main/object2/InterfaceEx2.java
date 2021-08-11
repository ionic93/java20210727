package main.object2;

public class InterfaceEx2 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1(); //Child3 클래스에서 method1()발동
        c.method2(); //Parent3 클래스에서 method2()발동
        MyInterface.staticMethod(); //MyInterface에서 발동
        MyInterface2.staticMethod(); //MyInterface2에서 발동
    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    //인터페이스끼리 디폴트 메서드가 서로 충돌할경우 구현할 클래스에서 디폴드 메서드를 재정의해야함
    public void method1(){
        System.out.println("method1() in Child3");
    }
}

class Parent3 {
    //조상 메서드와 디폴트 메서드가 충돌하면 디폴트 메서드가 무시됨
    public void method2(){
        System.out.println("method2() in Parent3");
    }
}

interface MyInterface {
    //MyInterface2의 method1과 충돌
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    //조상 메서드가 우선되므로 무시
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2{
    //MyInterface1의 method1과 충돌
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}
