package Io.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;

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
    JFileChooser fc;

    public NotepadComponent(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {

        ta = new JTextArea(10,20);
        scp = new JScrollPane(ta);
        fc = new JFileChooser();
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
        miNew.addActionListener(e->{
            ta.setText("");
        });

        miOpen = new JMenuItem("Open");
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK)); // 단축키 설정 ctrl+O
        miOpen.addActionListener(e-> {
            int returnVal = fc.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                //실제 파일을 오픈
                BufferedReader br = null;
                String fn = fc.getSelectedFile().toString();
                try {
                    FileReader fr = new FileReader(fn);
                    br = new BufferedReader(fr);
                    StringWriter sw = new StringWriter(); // 문자를 담기위한 변수
                    String line = "";
                    while ((line = br.readLine()) != null) {
                        sw.write(line); sw.write('\n');
                    }
                    ta.setText(sw.toString());
                    String tmp = fn.substring(fn.lastIndexOf("\\")+1);
                    setTitle(tmp);
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }finally {
                    try {
                        if(br !=null) br.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            } else {
                //사용자가 파일을 열지않음. 취소

            }
        }); //이벤트 처리

        miSave = new JMenuItem("Save");
        miSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK));
        miSave.addActionListener(e-> {
            int returnVal = fc.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
              //Save
                BufferedWriter bw = null;
                String fn = fc.getSelectedFile().toString();
                try {
                    FileWriter fw = new FileWriter(fn);
                    bw = new BufferedWriter(fw);
                    bw.write(ta.getText());
                    String tmp = fn.substring(fn.lastIndexOf("\\")+1);
                    setTitle(tmp);
                } catch (IOException ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        if(bw !=null) bw.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            } else {
                //Cancel
            }
        }); //이벤트 처리

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