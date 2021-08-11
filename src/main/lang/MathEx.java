package main.lang;

public class MathEx {
    public static void main(String[] args) {
        int[] arr = {78,89,72,91,64};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            max = Math.max(arr[i], arr[i+1]);
            min = Math.min(arr[i], arr[i+1]);
        }
        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);
        System.out.println(Math.rint(0.6));
        System.out.println(Math.rint(0.1));
        System.out.println(Math.rint(-1.6));
        System.out.println(Math.rint(-1.1));
    }
}
