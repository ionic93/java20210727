package Object1;

public class ConstructorEx {
    public static void main(String[] args) {
        Bike autoBike = new Bike("black","auto"); //생성자
        Bike threeBike = new Bike();
        threeBike.setColor("black"); //getter setter
        threeBike.setGearType("manual");
        //생성자와 geetter and setter 공통점 : 초기화
        //생성자와 geetter and setter 차이 : 시점의 차이
    }
}
class Bike{
    private String color;
    private String gearType;

    public Bike() {
        this("red","auto");
        //this()는 그 클래스가 가지고 있는 생성자를 가리킴
    }

    public Bike(String color, String gearType) {
        this.color = color;
        this.gearType = gearType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }



}