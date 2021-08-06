package exception;

public class MyExceptionEx {
    public static void main(String[] args) throws Exception {
        throw new MyException("내가 발생한 예외");
    }
}
class MyException extends Exception{
    public MyException(String msg) {
        super(msg); //모든 기본 생성자에는 super();가 생략되어있음
    }
}