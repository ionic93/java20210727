package generics;

import java.util.ArrayList;

public class GenericsEx1 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    //collection의 모든 원소는 Object
    //list.add(Object object) 매개변수의 타입이 Object
    list.add(new Tv()); // Tv => Object (자부)
//    list.get(0).power(); 부모에서 자식의 메서드를 찾을 수 없다.
    Tv tv = (Tv) list.get(0);  //Object => Tv (자부자: 반드시명시적)
    tv.power();

    //collection에 타입을 미리 지정한다. 이때는 E를 사용
    ArrayList<Tv> tvList = new ArrayList(); // ArrayList<E> 선언하면
    tvList.add(new Tv());     // add(E e)를 사용할 수 있다.
    tvList.get(0).power();
  }
}

class Tv{
  void power(){System.out.println("power");}
}