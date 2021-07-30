package array;

public class ArrayUtil {
    public static void prArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j !=0) System.out.print(",");
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void prArr(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i!=0) System.out.print(",");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void prArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i!=0) System.out.print(",");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
