package main.object2;

public class InheritanceAndInterfaceEx2 {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[2];
        Bird[] birds = new Bird[2];
        mammals[0] = (Mammal) new Tiger(); //자식이 부모로 형변환이 일어날 경우 묵시적 형변환 가능
        mammals[1] = new Bat();
        birds[0] = new Eagle();
        birds[1] = new Ostrich();
        //자식이 부모로 형변환이 일어날 수 없음
        // => 자식은 항상 부모보다 크거나 같으므로 부모로 형변환이 일어날 경우 초기화가 안되는 영역이 발생
        //그러나 자식이 부모로 갔다가 다시 자식으로 가면 형변환이 가능함
        Iground[] igrounds = new Iground[2];
        IFly[] iFlies = new IFly[2];
        igrounds[0] = new Tiger();
        igrounds[1] = new Ostrich();
        for (int i = 0; i < igrounds.length; i++) {
            igrounds[i].run();
        }
    }
}

class Mammal { }

class Bird{ }

class Tiger extends Mammal implements Iground{
    @Override
    public void run() {
        System.out.println("으르렁 으르렁");
    }
}
class Bat extends Mammal implements IFly{
    @Override
    public void fly() {
        System.out.println("쉬쉭");
    }
}

class Eagle extends Bird implements IFly{
    @Override
    public void fly() {
        System.out.println("펄럭 펄럭");
    }
}
class Ostrich extends Bird implements Iground{
    @Override
    public void run() {
        System.out.println("펄쩍");
    }
}

interface IFly{
   public abstract void fly();
}

interface Iground{
    void run();
}