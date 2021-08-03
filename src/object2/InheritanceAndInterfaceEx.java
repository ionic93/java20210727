package object2;

public class InheritanceAndInterfaceEx {
    public static void main(String[] args) {

    }
}
//다중 상속 하는법 => interface => 이름은 able을 붙이거나 앞에 i를 붙인다
class SeigeTank extends Terran{

}
class BattleCruiser extends Terran implements Flyable, Groundable{
    @Override //Override로 해당 메서드를 재정의 한다.
    public void fly() {

    }
}

interface Flyable {
    //interface에 변수를 선언하려면 static을 붙어야함
   static int Engine = 4;
    // 생략없을 경우 public final static int Engine = 4;
   void fly(); //추상메서드 : 완성 되어있지 않는 메서드
    // 생략없을 경우 public abstract void fly();
}
interface Groundable {

}