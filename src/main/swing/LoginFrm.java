package swing;

import javax.swing.*;

public class LoginFrm {
    public static void main(String[] args) {
        new LoginComponent(300,150,"Login");
    }
}

class LoginComponent extends BasicFrm {
    private JPanel pnlCenter, pnlSouth, pnlNorth;
    private JLabel jlbId, jlbPw;
    private JTextField jtf;
    private JPasswordField jpf;
    private JButton btnlgn, btnjoin, btncancel;

    public LoginComponent(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
        pnlNorth = new JPanel();
        jlbId = new JLabel("ID : ");
        jlbPw = new JLabel("Pw : ");
        jtf = new JTextField(10);
        jpf = new JPasswordField(10);
        btnlgn = new JButton("Login"); btnjoin = new JButton("Join"); btncancel = new JButton("Cancel");
    }

    @Override
    public void arrange() {
        pnlNorth.add(jlbId); pnlNorth.add(jtf);
        pnlCenter.add(jlbPw); pnlCenter.add(jpf);
        pnlSouth.add(btnlgn); pnlSouth.add(btnjoin); pnlSouth.add(btncancel);
        add(pnlNorth,"North");
        add(pnlCenter,"Center");
        add(pnlSouth,"South");
    }
}
