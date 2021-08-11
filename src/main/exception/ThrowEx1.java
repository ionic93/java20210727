package main.exception;

public class ThrowEx1 {
    public static void main(String[] args) {
        Exception e = new Exception("내가 임의로 예외 발생했음");
        try {
            throw e;
        } catch (Exception exception) {
//            main.exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }
}
