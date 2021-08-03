package object2;

public class AbstractClassEx {
    public static void main(String[] args) {
        Units units = new Units() {
            @Override // 추상 클래스에 있는 추상 메서드가 정의 되어 있지 않으므로 오버라이딩으로 직접 재정의
            void move(int x, int y) {
                System.out.println(x+","+y+"로 이동했습니다.");
            }
        };
        Zergling zergling = new Zergling(); //오버라이딩으로 재정의 하였으므로 문제 없음
    }
}

abstract class Units {
    int x,y;
   abstract void move(int x, int y);
   void stop(){}
}

class Zergling extends Units {
    @Override
    void move(int x, int y) {

    }
}