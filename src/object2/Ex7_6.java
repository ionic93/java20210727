package object2;
class Outer{
    class Inner{
        int iv = 100;
    }
    static class Inner2{
        int iv = 200;
    }
}
public class Ex7_6 {
    public static void main(String[] args) {
        Outer ou = new Outer();
        Outer.Inner in = ou.new Inner();
        System.out.println(in.iv);

        Outer.Inner2 staticin = new Outer.Inner2();
        System.out.println(staticin.iv);
    }
}
