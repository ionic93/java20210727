package lambda;

public class LambdaEx1 {
    public static void main(String[] args) {
//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int i, int j) {
//                return i>j?i:j;
//            }
//        };
        //람다식으로 줄이기
       MyFunction f = (i, j) -> i>j?i:j;
        int big = f.max(1,2);
        System.out.println(big);
    }

}
@FunctionalInterface
interface MyFunction {
    public int max(int i, int j);
}
