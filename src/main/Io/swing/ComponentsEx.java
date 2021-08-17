package Io.swing;

import org.jdatepicker.JDatePanel;
import org.jdatepicker.JDatePicker;

import javax.swing.*;

public class ComponentsEx {
    public static void main(String[] args) {
        new MyComponents(700, 500, "Components");

    }
}

class MyComponents extends BasicFrm {
    JPanel pnlNorth, pnlCenter, pnlSouth;
    JRadioButton[] rbGender;
    ButtonGroup group;
    JCheckBox[] cbHobby;
    JTextArea ta;
    JScrollPane scp;
    JDatePanel datePanel;
    JDatePicker datePicker;

    public MyComponents(int width, int height, String title) {
        super(width, height, title);
    }

    @Override
    public void init() {
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();

        rbGender = new JRadioButton[2];
        cbHobby = new JCheckBox[2];
        group = new ButtonGroup();

        datePicker = new JDatePicker();
        datePanel = new JDatePanel();
        datePanel.add(datePicker);

        String[] genders = {"Female","Male"};
        String[] hobbys = {"Reading","Music"};

        for (int i = 0; i < genders.length; i++) {
            rbGender[i] = new JRadioButton(genders[i],(i==0)?true:false);
            group.add(rbGender[i]);
            pnlSouth.add(rbGender[i]);

            cbHobby[i] = new JCheckBox(hobbys[i]);
            pnlCenter.add(cbHobby[i]);
        }
        ta = new JTextArea(10,20);
        scp = new JScrollPane(ta);
    }

    @Override
    public void arrange() {
        pnlNorth.add(datePanel);
        pnlNorth.add(datePicker);
        pnlNorth.add(scp);
        add(pnlNorth,"North");
        add(pnlCenter, "Center");
        add(pnlSouth,"South");
    }
}
