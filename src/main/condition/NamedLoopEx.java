package main.condition;

public class NamedLoopEx {
    public static void main(String[] args) {
        Loop1 : for (int i = 2; i <=9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                if (j == 5)
//                    break Loop1;  //2단중 2*4까지만 출력
                    break;  // 2~9단중 x*4 까지만 각각 출력
//                    continue Loop1; // 2~9단중 x*4 까지만 각각 출력
//                    continue; // 2~9단중 x*5만 빼고 각각 출력
                System.out.println(i+"*"+j+"="+i*j);
            } //end of for i
            System.out.println();
        } //end of Loop1
    }
}
