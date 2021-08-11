package main.array;

public class Exercise5_4 {
    public static void main(String[] args) {
        //2차원 배열에 담긴 모든 값의 총합과 평균을 구하기
        int[][] arr = {
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
                sum += arr[i].length;
            for (int j = 0; j <arr[i].length; j++) {
                total += arr[i][j];
            }
        }
        average = total/(float)sum;
        System.out.println("total=" + total);
        System.out.println("average=" + average);
    }
}
