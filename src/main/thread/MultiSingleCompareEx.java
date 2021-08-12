package main.thread;

public class MultiSingleCompareEx {
        static long startTime;
    public static void main(String[] args) {
        VerticalBar v = new VerticalBar();

        startTime = System.currentTimeMillis();
        v.start();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s","-");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("걸린 시간(-): "+(endTime-startTime));
    }
}

class VerticalBar extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s","|");
        }
        System.out.println("걸린 시간(|): "+(System.currentTimeMillis()-MultiSingleCompareEx.startTime));
    }
}
