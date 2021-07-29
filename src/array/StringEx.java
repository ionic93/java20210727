package array;

import java.util.Arrays;
import java.util.Locale;

public class StringEx {
    public static void main(String[] args) {
        String str = "Hello World";
        for (int i = 0; i <str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(str.substring(6));
        System.out.println(str.substring(2,10)); //매개변수가2개이면 첫번째인자위치부터 마지막인자-1위치까지
        System.out.println(str.toUpperCase());
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
