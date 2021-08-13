package swing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;

public class MyFrameEx2 extends BasicFrm{
    public static void main(String[] args) {
        new MyFrameEx2(500,300,"Component");
    }
    private JPanel pnlCenter, pnlSouth;
    private JLabel lbText, lbImage;
    private JTextField tfName;
    private JPasswordField pfPass;

    public MyFrameEx2(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pnlCenter = new JPanel(); pnlSouth = new JPanel();
        lbText = new JLabel("기본 컴포넌트");
        ImageIcon icon = new ImageIcon("src/images/like.jpg");
        lbImage = new JLabel(icon);
        tfName = new JTextField(10);
        pfPass = new JPasswordField(10);
    }

    @Override
    public void arrange() {
        pnlCenter.add(lbText); pnlCenter.add(lbImage);
        pnlSouth.add(tfName); pnlSouth.add(pfPass);
        add(pnlCenter,"North");
        add(pnlSouth,"Center");
        add(tfName,"West");
    }

    @Override
    public void inflate() {
        super.inflate();
    }
}
