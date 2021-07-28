package loop;

public class GugudanEx {
    public static void main(String[] args) {
        //구구단 1열로 세우기
        for (int i = 2; i <10 ; i++) {
            for (int j = 1; j <10 ; j++) {
                System.out.println(i+"x"+j+"="+((i*j)<10?"0"+(i*j):(i*j)));
            }
        }
        System.out.println(" ");
        //구구단 몇단 기준으로 세우기
        for (int i = 2; i <10; i++) {
                String str = " ";
            for (int j = 1; j <10; j++) {
                str = str + i+"*"+j+"="+(i*j)+" ";
            }
            System.out.println(str);
        }
        System.out.println(" ");
        //구구단 3줄마다 끊어서 세우기
        for (int i = 2; i <10; i+=3) {
            for (int j = 1; j <10; j++) {
                String str = " ";
                for (int k = 0; k <3; k++) {
                    if((i+k)!=10){ str = str + ((i+k) + "*" + j + "=" + ((i+k)*j <10 ? "0" + (i+k)*j : (i+k)*j) + " ");}

                }
                System.out.println(str);
            }
            System.out.println(" ");
        }
    }
}
