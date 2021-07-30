package loop.condition;

public class WhileEx2 {
    public static void main(String[] args) {
        //while
        int sum = 0;
        int i = 0;
        while (sum <= 100) {
            System.out.printf("%d - %d%n", i, sum);
            sum +=++i;
        }
        System.out.println("sum: "+sum);

        //break
        int sum2 = 0;
        int i2 = 0;
        while (true) {
            System.out.printf("%d - %d%n", i2, sum2);
            sum2 +=++i2;
            if(sum2>100) break;
        }
        System.out.println("sum2: "+sum2);
    }
}
