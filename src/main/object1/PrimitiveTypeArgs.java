package main.object1;

public class PrimitiveTypeArgs {
    public static void main(String[] args) {
        //기본형 매개변수
        Data d = new Data(); //d의 주소값 생성과 동시에 값이 초기화됨
        System.out.println(d.x);  // 0 int의 기본값이 0이므로
        d.x = 10; //10으로 값이 초기화됨
        System.out.println(d.x);  // 초기화된 값 10
        //1번 메서드 호출
        change(d.x); // d.x인 10을넘김 (일반값 넘김)
        System.out.println(d.x);  // 10
        // 2번 메서드 호출
        change(d); // 주소값을 넘김 => 동기화됨
        System.out.println(d.x); // 1000
        // 3번 메서드 호출
        Data d2 = copy(d); //tmp의 주소값이 넘어옴 => d2와 tmp는 동기화됨
        System.out.println("d2.x : "+d2.x); //d2.x=tmp.x=d.x의 값이므로 1000
        System.out.println("d2 : "+d2); //tmp의 주소값이 찍힘
    }
    //1번 메서드
    static void change(int x) { //x = 10이 넘어옴
        x = 1000;
        System.out.printf("change() : %d %n",x); // change() : 1000
        //이 x는 지역 변수이므로 메서드가 끝나는 순간 없어짐
    }
    //2번 메서드
    static void change(Data d) { //d의 주소값이 넘어옴
        d.x = 1000;
        System.out.printf("change() : %d %n",d.x); // change() : 1000
        //결국 d.x의 값이 1000으로 변화했으므로 메서드가 끝나도 d.x값은 1000
    }
    //3번 메서드
    static Data copy(Data d) {
        Data tmp = new Data(); //새로운 tmp의 주소값 생성
        tmp.x = d.x; //tmp.x에게 d.x의 값만 넘겨줌
        System.out.println("d의 주소값:"+d);
        System.out.println("tmp의 주소값:"+tmp);
        return tmp; //tmp의 주소값 반환
    }
}
class Data{
    int x;
}