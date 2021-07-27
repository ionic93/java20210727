package variable;

public class JungsuEx {
    byte b1;
    short s1;
    int i1;
    long l1;

    public JungsuEx() { } //생성자 : 멤버변수를 초기화시킴

    public static void main(String[] args) {
        JungsuEx j = new JungsuEx(); //JungsuEx()는 생성자라고 부름
        byte b2=(byte)130; //130은 1byte를 초과하므로 128부터는 음수를 끌어다 쓰면서 -128부터 내려간다
        System.out.println(j.b1); //0
        System.out.println(j.s1); //0
        System.out.println(j.i1); //0
        System.out.println(j.l1); //0
        System.out.println(b2); //-126
        System.out.println(j.b1+b2); //-126
        System.out.println(j.s1+b2); //-126
        j.i1 = 130+ j.s1;
        j.s1 = (short)j.i1; //큰곳에서 작은곳으로 (명시적 형변환)
        j.i1 = (int)j.s1; // 작은곳에서 큰곳으로 (묵시적 형변환 =>생략)
        System.out.println(j.i1);
        j.l1 = 100_000_000_000l;
        System.out.println(j.l1);
    }
    //new라는 생성 연산자를 만나게 되면 class에서 따로 초기화를 시키지 않아도 자동으로 초기화한다.
    //new는 참조형 변수에만 붙을 수 있음. 기본형에는 절대 붙을 수 없음
//    class 이름 뒤에 ()가 붙으면 메서드라고 부르지 않고 생성자라고 부른다
}
