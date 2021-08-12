package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        String[] strArr = {"aaa","bbb","ccc"};
        List<String> strList = Arrays.asList(strArr);
        System.out.println(strList);

        //Stream은 일회용이다
        //Stream은 데이터 소스를 변경하지 않는다.
        //Stream은 작업을 내부 반복으로 처리한다.
        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);
        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);

    }
}
