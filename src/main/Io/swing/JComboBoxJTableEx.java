package Io.swing;

import org.jdatepicker.JDatePicker;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JComboBoxJTableEx {
    public static void main(String[] args) {
        new SheetFrm(700,500,"Sheet");
    }
}

class SheetFrm extends BasicFrm {
    //메뉴 관련 변수
    private JMenuBar menuBar;
    private JMenu mnFile, mnInfo;
    private JMenuItem miOpen, miSave, miInfo;
    //콤보박스 관련 변수
    private JPanel pnl;
    private String[] arr;
    private JComboBox<String> cb;
    private JTextField tf;
    private JDatePicker dp;
    private JButton btnAdd, btnDel;
    //테이블 관련 변수
    private JTable table;
    private JScrollPane pane;
    private DefaultTableModel model;

    public SheetFrm(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        //테이블 만들기
        model = new DefaultTableModel(new String[]{"Date","Item","E/A"},0);
        table = new JTable(model);
        pane = new JScrollPane(table);
        //콤보박스 만들기
        arr = new String[]{"IceAmericano","Cappucino","DolcheLatte","Cocoa","Milk"};
        cb = new JComboBox<>(arr); //콤보박스에 string 배열
        pnl = new JPanel();
        tf = new JTextField(10);
        dp = new JDatePicker();
        btnAdd = new JButton("Add");
        btnDel = new JButton("Del");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Calendar valDate = (Calendar) dp.getModel().getValue();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
               Calendar cal = (Calendar) valDate;
               String dateStr = sdf.format(cal.getTime());
               String item = cb.getSelectedItem().toString();
               String ea = tf.getText();
               String[] arrRow = {dateStr,item,ea};
               model.addRow(arrRow);
            }
        });
        btnDel.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this,"선택된 행이 없습니다.");
                return;
            }
            model.removeRow(row);
        });
        //메뉴바 만들기
        menuBar = new JMenuBar();
        mnFile = new JMenu("File");
        mnFile.setMnemonic('F'); //단축키 설정 alt+F
        mnInfo = new JMenu("Info");
        mnInfo.setMnemonic('I'); //단축키 설정 alt+I
        miOpen = new JMenuItem("Open");
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK)); // 단축키 설정 ctrl+O
        miOpen.addActionListener(e-> System.out.println("Open")); //이벤트 처리
        miSave = new JMenuItem("Save");
        miInfo = new JMenuItem("Info");

        setJMenuBar(menuBar);
        menuBar.add(mnFile); menuBar.add(mnInfo);
        mnFile.add(miOpen); mnFile.add(miSave);
        mnInfo.add(miInfo);
    }

    @Override
    public void arrange() {
        pnl.add(dp); pnl.add(cb); pnl.add(tf); pnl.add(btnAdd); pnl.add(btnDel);
        add(pnl,"North");
        add(pane,"Center");
    }
}