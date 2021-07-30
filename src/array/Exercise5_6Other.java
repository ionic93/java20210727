package array;

import java.util.Scanner;

public class Exercise5_6Other {
    public static void main(String[] args) {
        String[] words = {
                "I am a boy",
                "You are girl",
                "Boys be Ambitious",
                "This is a pencil" };

        Scanner sacnner = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            String[] question = words[i].split(" ");
            int rand = (int)(Math.random()*question.length);

            String tmp = question[i];
            question[i] = question[rand];
            question[rand] = tmp;

            System.out.printf("Q%d. %s의 정답을 입력하세요>", i+1, prString(question));
            String answer = sacnner.nextLine();

            //trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
            if (words[i].equals(answer.trim()))
                System.out.printf("맞았습니다%n%n");
            else
                System.out.printf("틀렸습니다%n%n");
        }
    }
    public static String prString(String[] arr) {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (i!=0) result += " ";
            result += arr[i];
        }
        return result;
    }
}
