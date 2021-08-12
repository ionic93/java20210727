package main.thread;

public class DaemonThreadEx implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThreadEx());
        t.setDaemon(true); //해당 프로세스가 종료되기 전까지 죽지 않음.
        t.start();
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
            System.out.println(i);
            if (i==5) autoSave=true;
        }
        System.out.println("시스템 종료");
    }

    @Override
    public void run() { //main과 상관없이 별도로 무한반복함
        while (true) {
            try {
                Thread.sleep(1000*3);
            } catch (InterruptedException e) { }
            if(autoSave) autoSave();
        }
    }

    public void autoSave() { //autoSave가 Override된 run()메서드에서 사용되기 때문에 static 안붙여도 됨
        System.out.println("작업이 저장되었습니다.");
    }
}
