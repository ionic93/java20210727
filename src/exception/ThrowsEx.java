package exception;

public class ThrowsEx {
    public static void main(String[] args) throws Exception {
        method1();
    }
    static  void method1 () throws Exception{
        method2();
    }
    static void method2() throws Exception{
        System.out.println("method2()");
        throw new Exception("강제로 예외 발생");
    }
}
