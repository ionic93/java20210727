package ui;

import controller.MainController;
import dao.DaoUser;
import vo.UserVO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginFrm extends BasicFrm implements ActionListener {
    private JPanel pnlC, pnlS, pnlN;
    private JLabel lbId, lbPw;
    private JTextField  tfId;
    private JPasswordField  pfPw;
    private JButton btnLogin, btnJoin, btnCancel;

    public LoginFrm() {
        super(300, 150, "Login");
    }

    @Override
    public void init() {
        setResizable(false);
        pnlC = new JPanel();
        pnlS = new JPanel();
        pnlN = new JPanel();
        lbId = new JLabel("ID : ");
        lbPw = new JLabel("Pw : ");
        tfId = new JTextField(10);
        pfPw = new JPasswordField(10);
        tfId.setText("ADMIN"); //임시로 아이디 설정 나중에 지울것
        pfPw.setText("1"); //임시로 비밀번호 설정 나중에 지울것
        btnLogin = new JButton("로그인");
        btnJoin = new JButton("가입");
        btnCancel = new JButton("취소");
        btnLogin.addActionListener(this);
        btnJoin.addActionListener(this);
        btnCancel.addActionListener(this);

    }

    @Override

    public void arrange() {
        pnlN.add(lbId);
        pnlN.add(tfId);
        pnlC.add(lbPw);
        pnlC.add(pfPw);
        pnlS.add(btnLogin);
        pnlS.add(btnJoin);
        pnlS.add(btnCancel);
        add(pnlN, "North");
        add(pnlC, "Center");
        add(pnlS, "South");
    }

    @Override
    public void inflate() {
        super.inflate();
    }
    public void actionPerformed(ActionEvent e) {
        String id = tfId.getText();
        String pw = new String(pfPw.getPassword()); //암호화되어 있기 때문에 인스턴스로 생성
        if (e.getSource() == btnLogin) {
            if (id == null || id.equals("")) {
                JOptionPane.showMessageDialog(null,"아이디를 확인하세요","Message",JOptionPane.ERROR_MESSAGE);
                tfId.requestFocus();
                return;
            }
            if (pw == null || pw.equals("")) {
                JOptionPane.showMessageDialog(null,"비빌번호를 확인하세요","Message",JOptionPane.ERROR_MESSAGE);
                pfPw.requestFocus();
                return;
            }
            UserVO userVO = new DaoUser().checkLogin(id,pw);
            if (userVO == null) {
                JOptionPane.showMessageDialog(null,"아이디나 비밀번호가 맞지 않습니다","Message",JOptionPane.ERROR_MESSAGE);
                tfId.setText(""); pfPw.setText("");
                tfId.requestFocus();
                return;
            }
            dispose();
            MainController.forwardControl("Main");
        } else if (e.getSource() == btnCancel) {
            System.exit(0);
        } else if (e.getSource() == btnJoin) {
        }
    }
}
