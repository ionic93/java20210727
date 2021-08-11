package main.exception;

public class ExceptionException {
    public static void main(String[] args) {
//        throw new Exception(); //컴파일 안됨
        throw new RuntimeException(); //컴파일은 되지만 실행시 예외 발생
    }
}
