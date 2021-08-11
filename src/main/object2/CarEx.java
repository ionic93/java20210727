package main.object2;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        FireCar fireCar = new FireCar();
        fireCar.drive();
        fireCar.stop();
        SportsCar sportsCar = new SportsCar();
        System.out.println(fireCar instanceof Car?"상속관계":"관계없음"); //instanceof : 상속 관계 판별
        System.out.println(sportsCar instanceof Car?"상속관계":"관계없음");
        System.out.println(new Car() instanceof Car?"상속관계":"관계없음");
//        System.out.println(fireCar instanceof SportsCar?"상속관계":"관계없음"); //같은 부모에서 상속받았지만 자손끼리는 관계가 없음
        System.out.println(fireCar instanceof Object?"상속관계":"관계없음"); //모든 클래스는 Object에게 상속받고 있음
        System.out.println(sportsCar instanceof Object?"상속관계":"관계없음");
        System.out.println(car instanceof Object?"상속관계":"관계없음");
        car = fireCar;
        fireCar = (FireCar) car; //자식 -> 부모 -> 자식은 가능
//        fireCar = (FireCar)sportsCar; //수직 관계 형성 안됨.
    }
}
class Engine{}
class Car {
    int wheel;
    void drive(){}
    void stop(){}
    Engine engine;

    @Override
    public String toString() {
        return getClass().getName();
    }
}
class FireCar extends Car{
    void waterGun(){}
}
class SportsCar extends Car{
    int turbo;
}
