package object2;

public class InheritanceDuplicateEx {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
//        Child c1 = new Parent();  부모에서 자식으로 형변환이 되므로 불가
        Parent p1 = new Child(); //자식에서 부모로 형변환이 되므로 묵시적 형변환 가능
        System.out.println("자부의 x:" + p1.x); //멤버변수는 부모의 멤버변수를 이용하고(단 자식에 멤버변수가 없으면 부모껄 갖다 쓴다)
        p1.method(); //메서드는 자식의 메서드를 이용한다
    }
}

class Parent {
    int x = 10;
    public Parent(int x){
        this.x=x;
    }
    void method(){
        System.out.println("Parent");

    }
}

class Child extends Parent {
//    int x = 20;
    public Child(){
        super(20); //super는 항상 첫번째 줄에 위치하여야 한다.
        System.out.println("생성자");
    }
    void method(){
        System.out.println("Child");
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
}