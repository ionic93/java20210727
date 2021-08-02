package Object1;

public class InitBlockEx {
    public static void main(String[] args) {
        System.out.println(Bicycle.wheel);
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.gear);
    }
}
class Bicycle{
    static {System.out.println("static Constructor");} //static이 붙으면 먼저 실행됨
    {System.out.println("Instatance Constructor");}
    String model;
    int gear;
    static int wheel;

    public Bicycle() {
        System.out.println("생성자");
    }
}