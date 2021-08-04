package object2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClassEx {
    public static void main(String[] args) {
        //interface를 익명객체화
        JButton btn = new JButton("확인");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //배열에 들어가는 인스턴스를 익명객체로 만들수 있다.
        JButton btnFirst = new JButton("1st");
        JButton[] btns = new JButton[5];
        btns[0] = btnFirst; //이름이 있는 배열에 인스턴스 생성
        btns[1] = new JButton("두번째 버튼"); //배열에 인덱스로만 접근 이름 없음/
        btns[2] = new JButton("세번째 버튼"); //즉 익명 객체

        //인스턴스가 익명객체화 될 때
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}
