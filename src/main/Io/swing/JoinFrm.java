package Io.swing;

import javax.swing.*;
import java.awt.*;

public class JoinFrm {
    public static void main(String[] args) {
        new JoinComponent(350,300,"Join");
    }
}

class JoinComponent extends BasicFrm {
    private JPanel jpa1, jpa2, jpa3, jpa4, jpa5, jpa6;
    private JLabel jbl1, jbl2, jbl3, jbl4, jbl5;
    private JTextField jta1, jta2;
    private JPasswordField jta3;
    private JRadioButton jrb1, jrb2;
    private ButtonGroup group;
    private JCheckBox jcb1, jcb2;
    private JButton btn1, btn2;
    public JoinComponent(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
    jpa1 = new JPanel();
    jpa2 = new JPanel();
    jpa3 = new JPanel();
    jpa4 = new JPanel();
    jpa5 = new JPanel();
    jpa6 = new JPanel();

    jbl1 = new JLabel("이름: ");
    jbl2 = new JLabel("아이디: ");
    jbl3 = new JLabel("비밀번호");
    jbl4 = new JLabel("성별");
    jbl5 = new JLabel("취미");

    jta1 = new JTextField(10);
    jta2 = new JTextField(10);
    jta3 = new JPasswordField(10);

    jrb1 = new JRadioButton("Female");
    jrb2 = new JRadioButton("Male");
    group = new ButtonGroup();
    group.add(jrb1); group.add(jrb2);

    jcb1 = new JCheckBox("Reading");
    jcb2 = new JCheckBox("Music");

    btn1 = new JButton("Join");
    btn2 = new JButton("Exit");

    jpa1.add(jbl1); jpa1.add(jta1);
    jpa2.add(jbl2); jpa2.add(jta2);
    jpa3.add(jbl3); jpa3.add(jta3);
    jpa4.add(jbl4); jpa4.add(jrb1); jpa4.add(jrb2);
    jpa5.add(jbl5); jpa5.add(jcb1); jpa5.add(jcb2);
    jpa6.add(btn1); jpa6.add(btn2);
    }

    @Override
    public void arrange() {
     setLayout(new GridLayout(0,1));
     add(jpa1);
     add(jpa2);
     add(jpa3);
     add(jpa4);
     add(jpa5);
     add(jpa6);
    }
}
