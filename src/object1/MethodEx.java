package object1;

public class MethodEx {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println(mm.add(10,20));
    }
}

class MyMath {
    //메서드의 retrun type은 void, 기본형 8가지, 참조형 총 10가지
    //메서드의 이름이 다르면 아무 문제가 없으나 메서드의 이름이 같으면 매개변수가 달라야함
    //같은 클래스 내에 같은 이름의 메서드가 있는것 = 오버로딩
    //왜 이름을 같게 만들까? => 하나의 이름을 가진 메서드로 여러 매개변수를 사용할 수 있기 때문에
    //오버로딩 규칙 : 이:이름이 같다, 매:매개변수 다르다. 리:리턴타입 상관없다.
    void add() {
        System.out.println();
        return; //사실 생략되어 있음
    } //void는 retrun 없음
    boolean add(boolean arg) {
        boolean result = false; //지역 변수에는 static을 붙이지 못한다.
        return result;
    }
    boolean add(char arg) {return true;}
    byte add(byte arg) {return 0;}
    short add(short arg) {return 0;}
    int add(int arg) {return 0;}
    long add(long arg) {return (long)0;}
    float add(float arg) {return 0.0f;}
    double add(double arg) {return 0.0;}
    int[] add(int[] arg) {return new int[]{0};}
    String add(String arg) {return "";}
    Car add(Car arg){return new Car();}
    Car[] add(Car[] arg){return new Car[]{new Car()};}
//    void subtract(){}
    int subtract(){return 0;}

    public long add(int i, int i1) {
        long result;
        result = (long)i+i1;
        return result;
    }

    //리턴타입 메서드명(){   }
}

class Car {}
