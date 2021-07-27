package variable;

import javax.swing.*;
import java.awt.*;

public class BooleanEx {
    boolean power; //선언만 가능

    //    power = false; 멤버변수에서 초기화만 따로 할 수 없다.
   void turn() {
        if(power){
            power = false;
        } else {
            power = true;
        }
        System.out.println(this +"전원이 " + power +" 되었습니다.");
    }
    public static void main(String[] args) {
        // new를 만나면 멤버변수가 기본값으로 초기화가 된다.
//        power = true;
        BooleanEx b = new BooleanEx();
        b.turn();
        b.turn();
        BooleanEx b1 = new BooleanEx();
        b1.turn();
        Tv tv = new Tv();
        tv.turn();
    }

}

class Tv{
    String model;
    String maker;

   int channel;
   boolean power;
   int volume;

   void turn(){
       power = power ? false : true;
   }
   void chanUp(){}
   void chanDown(){}
   void volUp(){}
   void volDown(){}


}
