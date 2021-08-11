package main.array;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,95};
        int max = score[0];
        int min = score[0];
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            if(max<score[i]) max = score[i];
            if(min>score[i]) min = score[i];
            total+= score[i];
        }
        System.out.println("최대값:"+max);
        System.out.println("최대값:"+min);
        System.out.printf("총합: %3d %n", total);
        System.out.printf("평균: %5.2f", (float)total/score.length);
    }
}
