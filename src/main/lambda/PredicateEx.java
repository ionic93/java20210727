package lambda;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
//        Predicate<String> isEmptyStr = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length()==0;
//            }
//        };
        //람다식으로 하기
        Predicate<String> isEmptyStr = s -> s.length()==0;
        String str = "";
        if (isEmptyStr.test(str)) {
            System.out.println("비어있는 문자열입니다.");
        }
    }
}
