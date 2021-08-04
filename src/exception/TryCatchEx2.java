package exception;

public class TryCatchEx2 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(10/0);
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (e instanceof ArithmeticException)
                System.out.println("ArithmeticException 맞음");
        System.out.println(4);
        }
        System.out.println(5);
        System.out.println(6);
    }
}
