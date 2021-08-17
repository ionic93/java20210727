package Io.swing;

import javax.swing.*;

public abstract class BasicFrm extends JFrame {
    private int width, height;

    public BasicFrm(int width, int height, String title) {
        super(title);
        this.width = width;
        this.height = height;
        init();
        arrange();
        inflate();
    }
    public abstract void init();
    public abstract void arrange();
    public void inflate() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창을 닫았을때 종료
        setSize(width,height); //사이즈를 초기화해줘야 작동가능
        setLocationRelativeTo(this); //창을 가운데 오픈
        setVisible(true); //창 보이게 하기
    }
}
