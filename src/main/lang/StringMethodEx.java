package main.lang;

import java.util.Arrays;

public class StringMethodEx {
    public static void main(String[] args) {
        String str = "abc"; //값을 넣음
        str = new String("abc"); //String 생성자에 매개변수
        str = new String(new char[]{'a','b','c'}); //String 생성자에 배열 매개변수
        str = new String(new StringBuffer("abc"));

        System.out.println(str.charAt(0));
        System.out.println(str.compareTo("0abc")); //비교하려는 문자열이 같으면 0, 크면 음수, 작으면 양수
        System.out.println(str.concat("defg")); //문자열을 뒤에 덧붙임
        System.out.println(str.contains("a")); //해당 문자열을 포함하는지 체크
        System.out.println(str.endsWith("c")); //해당 문자열로 끝나는지 체크
        System.out.println(str.startsWith("a"));// 해당 문자열로 시작하는지 체크
        System.out.println(str.equalsIgnoreCase("ABC")); //대소문자 무시하고 같은지 체크
        System.out.println(str.indexOf("bc")); //해당 문자열의 시작 인덱스 위치 체크, 없으면 -1
        System.out.println(str.lastIndexOf("c"));
        System.out.println("c:\\classJava\\Hello.java".lastIndexOf('.'));

        str = "c:\\classJava\\Hello.java"; // '.'의 index 값 : 18
        System.out.println(str.substring(str.lastIndexOf('.')+1));// '.'+1 =19번째부터 끝까지 출력
        System.out.println(str.substring(str.lastIndexOf('.')+1, 20)); //'.'+1 =19번째부터 20번 앞까지 출력 =j

        str = "abc";
        String str2 = "abc";
        System.out.println(str.intern());// 문자열을 상수 풀(Constant Pool)에 등록함, 이미 있을경우 주소값을 반환함
        System.out.println(str.intern() == str2.intern());
        System.out.println(str.length()); //문자열 길이
        System.out.println(str.replace("a","b"));//문자를 교체
        System.out.println("aabaacc".replace("aa","ee"));
        System.out.println("aabaacc".replaceAll("aa","ee"));
        System.out.println("aabaacc".replaceFirst("aa","ee"));
        System.out.println("thor,iron,hulk".split(",")[2]); //hulk
        System.out.println(Arrays.toString("Hello World".split(""))); //[H, e, l, l, o,  , W, o, r, l, d]
        System.out.println("     Hello     World    ".trim()); // 양쪽 공백 제거
        System.out.println(true);
        System.out.println(String.valueOf(1)+String.valueOf(2));
        System.out.println(Integer.parseInt("1")+Integer.parseInt("2"));
    }
}
