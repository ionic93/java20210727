package lang;

import java.util.StringJoiner;

public class StringJoinerAndJoin {
    public static void main(String[] args) {
    String animals = "dog,cat,bear";
    String[] arr = animals.split(",");
    System.out.println(String.join("*",arr));
    StringJoiner joiner = new StringJoiner("/","[","]");
        for (String s : arr) { //향샹된 for문
            joiner.add(s);
        }
        System.out.println(joiner.toString());

    StringJoiner joiner2 = new StringJoiner(",","[","]");
        int[] arr2 = {1,2,3,4};
        for (int a : arr2) {
            joiner2.add(String.valueOf(a));
        }
        System.out.println(joiner2.toString());
    }

    int i = Integer.parseInt("100"); //문자를 숫자로 바꿈
    int i2 = Integer.valueOf("100"); //위와 결과는 같으나 문자가 참조형 변수로 갔다가 기본형으로 바뀜
}
