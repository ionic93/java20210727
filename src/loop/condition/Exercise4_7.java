package loop.condition;

import javax.swing.*;

public class Exercise4_7 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "합하고자 하는 숫자를 입력하시오");
        int sum=0;
        for (int i = 0; i < input.length(); i++) {
            sum+= input.charAt(i)-'0';
        }
        System.out.println("합은"+sum);
    }
}
