package Object1;

public class Exercise6_16 {
    public static void change(String str){
        str +="456";
        System.out.println(str.hashCode());
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        //String type의 변수는 매개변수로 넘어갈 때
        //주소값이 아닌 char[]의 실제 값이 넘어감
        //String 타입의 변수는 연산이 되지 않는다.
        //String이 연산을 하게 되면 새로운 주소로 변경됨.
        change(str);
        System.out.println("After change:"+str);
        System.out.println(str.hashCode());
    }
}
