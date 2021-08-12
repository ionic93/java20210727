package main.thread;


public class RunnableEx {
    public static void main(String[] args) {
        Bomb1 bomb1 = new Bomb1(); //Runnable 인터페이스를 상속받으면 따로 Thread 인스턴스를 생성해야지만 start()를 사용 가능
        Thread t = new Thread(bomb1);
        t.start();

        NuclearBomb nuclearBomb = new NuclearBomb();
        nuclearBomb.start();  //Thread를 상속받은 클래스는 인스턴스를 만들고 바로 start()를 사용할 수 있다.
    }
}

class NuclearBomb extends Thread { }
class Explosion{ }
class Bomb1 extends Explosion implements Runnable{
    @Override
    public void run() {

    }
}