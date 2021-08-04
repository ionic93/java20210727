package object2;

class Product {
    int price; //제품의 가격
    int bonusPoint; //제품구매시 제공하는 보너스 점수

    Product(){}
    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}
class Tv1 extends Product{
    Tv1() {}

    @Override
    public String toString() {
        return "Tv";
    }
}
public class Ex7_3 {
    Tv1 t = new Tv1();
}
