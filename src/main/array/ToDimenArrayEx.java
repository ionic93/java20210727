package main.array;

public class ToDimenArrayEx {
    public static void main(String[] args) {
        //    int[][] score = new int[4][3];
        int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};

        for (int[] ints : score) {
            for (int j = 0; j < ints.length; j++) {
                if (j != 0) System.out.print(",");
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }

        int[][] result = new int[score.length + 1][score[0].length+1];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];
                result[i][score[i].length] += score[i][j];
                result[score.length][j] += score[i][j];
                result[score.length][score[i].length] += score[i][j];
            }
        }
        printTwo(result);
    }

    private static void printTwo(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                if (j != 0) System.out.print(",");
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }
    }
}