package network;

import swing.BasicFrm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.*;

public class TcpIpMultichatClientForm extends BasicFrm {
    private JTextArea ta; //채팅 입력부분
    private JScrollPane scp; //채팅 스크롤부분
    private JTextField tf; //채팅이 올라오는 부분
    private String nickName, ip;
    private DataOutputStream out; //출력 스트림

    public TcpIpMultichatClientForm() {
        super(500, 600, "Chatting Room");
        tf.requestFocus(); //채팅창 입력부분 커서 표시
    }

    @Override
    public void init() {
        nickName = JOptionPane.showInputDialog("채팅할 대화명을 입력하세요!");
        ip = JOptionPane.showInputDialog("서버 IP를 입력하세요!");

        ta = new JTextArea(); //채팅창 부분 초기화
        ta.setEditable(false); //채팅창 부분 수정 불가
        scp = new JScrollPane(ta); //채팅창 스크롤 초기화
        tf = new JTextField(); //채팅창 입력 부분 초기화
        ta.setFont(new Font("맑은 고딕",Font.PLAIN,20));
        tf.setFont(new Font("맑은 고딕",Font.PLAIN,20));
        try {
            Socket socket = new Socket(ip, 7777); //소켓에 ip와 포트번호 입력
            out = new DataOutputStream(socket.getOutputStream()); // 출력스트림 초기화(이때 출력스트림을 위에서 만든 소켓의 출력스트림과 동기화)
            out.writeUTF(nickName);// 출력스트림에 닉네임 표시

            Receiver receiver = new Receiver(socket); //받는 쓰레드 생성
            receiver.start(); //받는 쓰레드 실행
        } catch (IOException e) {
            e.printStackTrace();
        }
        tf.addActionListener(new ActionListener() {//Sender Thread의 역할을 대체 -> 이벤트
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = tf.getText(); //채팅창 입력한 글자들 변수로 설정
                if (msg==null||msg.equals("")) return;
                try {
                    out.writeUTF("["+nickName+"] "+msg); //출력스트림에 [닉네임]+입력한 글자 표시
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                tf.setText(""); //출력한후 채팅창 입력부분 초기화
            }
        });
    }

    @Override
    public void arrange() {
        add(scp, "Center"); //swing 위치 설정
        add(tf, "South"); //swing 위치 설정
    }

    public static void main(String[] args) {
        new TcpIpMultichatClientForm();
    }

    class Receiver extends Thread { //내가 받을 데이터를 받기 위한 Receiver Thread 생성 이 쓰레드는 프로그램 종료전까지 돌아가야함
        Socket socket; //네트워크를 사용하기 위한 통로
        DataInputStream in; // I/O stream(socket에서 획득, 그래야 똑같은 네트워크에서 받을수 있음)

        //위의 변수들을 생성자를 통해서 초기화!
        Receiver(Socket socket){
            this.socket = socket;
            try {
                //소켓으로 부터 입력스트림을 획득
                in = new DataInputStream(socket.getInputStream());//예외가 항상 발생할수 있어서 Try Catch문 사용
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (in != null) {
                try {
                    ta.append(in.readUTF()+"\n"); //채팅창에 받아온 글씨 추가
                    ta.setCaretPosition(ta.getDocument().getLength());

                } catch (IOException e) { }
            }
        }
    }
}