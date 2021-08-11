package main.array;

public class ArrayDeclare {
    public static void main(String[] args) {
        //배열 선언 방법
        int[] arr;
        arr = new int[]{1,2,3,4,5}; //1번
        prArr(arr);
        int[] arr2 = new int[]{1,2,3,4,5}; //2번
        prArr(arr2);
        int[] arr3 = {1,2,3,4,5}; //3번
        prArr(arr3);
        int[] arr4 = new int[5]; // int type의 배열이면서 크기가 5인 배열
        arr4[0]=1;
        arr4[1]=2;
        arr4[2]=3;
        arr4[3]=4;
        arr4[4]=5;
        prArr(arr4);

        char[] charArr = {'H','e','l','l','o'};
        char[] chars = new char[5];
        chars[0] = 'H';
        chars[1] = 'e';
        chars[2] = 'l';
        chars[3] = 'l';
        chars[4] = 'o';

        String[] avengers = {"Thor", "Ironman", "Captin", "Hulk", "BlackWidow"};
        prArr(avengers);
        String[] strArr = new String[5];
        prArr(strArr); //참조형 변수의 기본값은 null이므로 null만 나옴
    }
    private static void prArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
//    매개변수가 다르다면 같은 이름으로 메서드를 사용해도 다르게 인식한다.
    private static void prArr(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i!=0) System.out.print(",");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
