package object1;
class MyPoint{
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(int x1, int y1){
        return Math.sqrt(Math.pow((this.x-x1),2)+Math.pow((this.y-y1),2));
    }
}
public class Exercise6_6 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        //p와 (2,2)의 거리를 구한다
        System.out.println(p.getDistance(2,2));
    }
}
