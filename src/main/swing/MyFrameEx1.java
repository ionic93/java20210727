package swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyFrameEx1 {
    public static void main(String[] args) {
        new MyFrm1(500,300,"");
    }
}

//Jframe, Jpanel, JscrollPane = 담을 수 있는 component
class MyFrm1 extends BasicFrm {
    private JLabel lbTitle;
    private JButton[] btns;
    private String[] arr;
    private JPanel[] pnl;

    public MyFrm1(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        btns = new JButton[5];
        arr = new String[]{"North","South","Center","East","West"};
        pnl = new JPanel[5];
//        lbTitle = new JLabel("버튼을 눌러주세요");
        for (int i = 0; i < btns.length; i++) {
            pnl[i] = new JPanel();
            btns[i] = new JButton(arr[i]);
//            btns[i].setBounds(i*100,i*30,100,30); //setLayout(null)때 사용
//            pnl.add(btns[i],arr[i]); //Jpanel에 버튼을 담는다
            pnl[i].add(btns[i],arr[i]);
            add(pnl[i]);
        }
    }

    @Override
    public void arrange() {
//        add(pnl); //Jframe에 Jpanel을 추가
//        setLayout(new BorderLayout()); //Jframe의 기본 레이아웃
//        setLayout(new FlowLayout());
//        setLayout(null); //Absolute Layout으로 바뀜 => 절대배치 => 좌표를 다 설정해줘야함
        setLayout(new GridLayout(2,3));
    }
}