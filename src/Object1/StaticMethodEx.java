package Object1;

public class StaticMethodEx {
    public static void main(String[] args) {
        System.out.println(MyMath2.add(1,2));
        System.out.println(MyMath2.c);
        MyMath2 mm = new MyMath2();
        System.out.println(mm.add());
        System.out.println(mm.add(1,2));
    }
}

class MyMath2 {
    long a, b;
    static long c;
    long add(){return a+b;}
    static long add(long l1, long l2){return l1+l2;}
}