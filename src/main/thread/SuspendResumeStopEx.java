package main.thread;

public class SuspendResumeStopEx {
    public static void main(String[] args) {
        RunImpl r = new RunImpl();
        Thread t1 = new Thread(r,"*");
        Thread t2 = new Thread(r,"**");
        Thread t3 = new Thread(r,"***");
        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(2000);
            t1.suspend();
            Thread.sleep(2000);
            t2.suspend();
            Thread.sleep(3000);
            t1.resume();
            Thread.sleep(3000);
            t1.stop();
            t2.stop();
            Thread.sleep(2000);
            t3.stop();

        } catch (InterruptedException e) { }
    }
}

class RunImpl implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName()); // Thread.currentThread().getName() = 쓰레드의 이름을 찍어주는 문법
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        }
    }
}