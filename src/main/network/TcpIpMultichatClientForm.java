package network;

import Io.swing.BasicFrm;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpMultichatClientForm extends BasicFrm {
    JTextArea ta;
    JScrollPane scp;
    JTextField tf;

    public TcpIpMultichatClientForm() {
        super(300, 600, "채팅창");
    }

    @Override
    public void init() {
        ta = new JTextArea();
        scp = new JScrollPane(ta);
        tf = new JTextField();
    }

    @Override
    public void arrange() {
        add(scp, "Center");
        add(tf, "South");
    }


    public static void main(String[] args) {
        String nickName = JOptionPane.showInputDialog("채팅할 대화명을 입력하세요!"); //대화명 입력
        String ip = JOptionPane.showInputDialog("서버 IP를 입력하세요!"); //서버 IP 입력
        try {
            Socket socket = new Socket(ip, 7777); //네트워크 문을 열기위한 Socket 생성(Try Catch로 예외 잡아줌)
            System.out.println("서버에 접속되었습니다.");
           TcpIpMultichatClientForm tcp = new TcpIpMultichatClientForm();
//            Sender sender = new Sender(socket, nickName);// 소켓과 닉네임을 Sender Thread로 보내줌
//            sender.start(); //Sender Thread를 실행
            Receiver receiver = tcp.new Receiver(socket);
            receiver.start(); //Receiver Thread 실행
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    static class Sender extends Thread { //내가 쓴 데이터를 보내기 위한 Sender Thread 생성(Thread를 상속) 이 쓰레드는 계속 돌아가야함
//        Scanner scan = new Scanner(System.in); //키보드 입력받기 위한 인스턴스
//        Socket socket; //네트워크를 사용하기 위한 통로
//        DataOutputStream out; // I/O stream(socket에서 획득, 그래야 그 네트워크로 보낼수 있음)
//        String nickName; //통신할 때 구분되는 ID같은 개념

//        //위의 변수들을 생성자를 통해서 초기화!
//        public Sender(Socket socket, String nickName){ //서버와 연결한 socket와 동일한 socket으로 초기화
//            this.socket = socket;
//            this.nickName = nickName;
//            try {
//                //소켓으로 부터 출력스트림을 획득
//                out = new DataOutputStream(socket.getOutputStream());//예외가 항상 발생할수 있어서 Try Catch문 사용
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Override
//        public void run() {//Thread는 항상 실행해야 하기 때문에 run()메서드 있어야함(재정의)
//            try {
//                if(out!=null) out.writeUTF(nickName); //입출력 스트림에 무언가 들어오면 일단 닉네임을 출력해줌(본인은 못봄)
//                while (out != null) {
//                    String tmp = JOptionPane.showInputDialog("메세지를 입력하세요!");
//                    if(tmp.equals("Q")){
//                        System.out.println("채팅이 종료됩니다");
//                        System.exit(-1);
//                    }
//                    if(tmp!=null &&!tmp.equals("")) out.writeUTF("["+nickName+"]"+tmp);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
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
                    ta.append(in.readUTF()+"\n");
                } catch (IOException e) { }
            }
        }
    }
}
