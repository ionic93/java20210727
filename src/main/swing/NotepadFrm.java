package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class NotepadFrm {
    public static void main(String[] args) {
        new NotepadComponent(500,600,"Notepad");
    }
}

class NotepadComponent extends BasicFrm {

    private JMenuBar menuBar;
    private JMenu mnFile, mnEdit, mnVisual, mnHelp ,mnInfo;
    private JMenuItem miNew, miOpen, miSave, miInfo;

    private JTextArea ta;
    private JScrollPane scp;

    public NotepadComponent(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {

        ta = new JTextArea(10,20);
        scp = new JScrollPane(ta);
        //
        menuBar = new JMenuBar();
        mnFile = new JMenu("File");
        mnFile.setMnemonic('F'); //단축키 설정 alt+F
        mnInfo = new JMenu("Info");
        mnInfo.setMnemonic('I'); //단축키 설정 alt+I
        mnEdit = new JMenu("Edit");
        mnEdit.setMnemonic('E');
        mnVisual = new JMenu("Visual");
        mnVisual.setMnemonic('V');
        mnHelp = new JMenu("Help");
        mnHelp.setMnemonic('H');

        miNew = new JMenuItem("New");
        miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
        miOpen = new JMenuItem("Open");
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK)); // 단축키 설정 ctrl+O
        miOpen.addActionListener(e-> System.out.println("Open")); //이벤트 처리
        miSave = new JMenuItem("Save");
        miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK));
        miInfo = new JMenuItem("Info");

        setJMenuBar(menuBar);
        menuBar.add(mnFile); menuBar.add(mnEdit); menuBar.add(mnInfo); menuBar.add(mnVisual); menuBar.add(mnHelp);
        mnFile.add(miNew); mnFile.add(miOpen); mnFile.add(miSave);
        mnInfo.add(miInfo);
    }

    @Override
    public void arrange() {
        add(scp,"Center");
    }
}