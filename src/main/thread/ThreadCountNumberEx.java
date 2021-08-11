package main.thread;

import javax.swing.*;

public class ThreadCountNumberEx {
    public static void main(String[] args) {
        Bomb b = new Bomb();
        b.start();
        String pickLine = JOptionPane.showInputDialog("빨간선(0), 파란선(1) 중 선택하시오");
        b.pickLine(Integer.parseInt(pickLine));
    }
}
class Bomb extends Thread{
    boolean stopped = false;
    int realLine = (int)(Math.random()*2);
    @Override
    public void run() {
//        int i=10;
//        while (i!=0 && !isInterrupted()) {
//            System.out.println(i--);
//            for (long x=0; x<2500000000L; x++);
//        }

//        for (int i = 10; i > 0; i--) {
//            System.out.println(i);
//            for (long x=0; x<2500000000L; x++);
//            if (isInterrupted()) {
//                break;
//            }
//        }
        for (int i = 10; i >0 ; i--) {
            if (stopped) break;
            System.out.println(i);
            try { Thread.sleep(1000);} catch (InterruptedException e) { }
        }
        System.out.println("카운트가 종료되었습니다.");
        System.exit(0);
    }
    void pickLine(int pickLine){
        if (realLine == pickLine) {
            System.out.println("휴 살았다.");
            interrupt();
            stopped = true;
        } else {
            System.out.println("꽝!");
        }
            interrupt();
            stopped = true;
    }
}
