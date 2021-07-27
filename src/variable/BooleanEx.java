package variable;

import javax.swing.*;
import java.awt.*;

public class BooleanEx {
    boolean power; //선언만 가능

    //    power = false; 멤버변수에서 초기화만 따로 할 수 없다.
    void turn() {
        boolean onOff; //지역변수에서는 선언과 초기화를 따로 할 수 있다.
        onOff = true;
        power = !power;
        System.out.println(power);
    }
    public static void main(String[] args) {
        //new를 만나면 멤버변수가 기본값으로 초기화가 된다.
        BooleanEx booleanEx = new BooleanEx();
        booleanEx.turn();
        booleanEx.turn();
        booleanEx.turn();
        booleanEx.turn();

    }

}

class Myfrm extends JFrame {
    private JButton btnConfirm;
    public Myfrm() throws HeadlessException {
        btnConfirm = new JButton("확인");
        setLayout(null);
        btnConfirm.setBounds(100, 50, 100, 100);
        add(btnConfirm);
        setSize(500, 400);
        setVisible(true);

    }
}
