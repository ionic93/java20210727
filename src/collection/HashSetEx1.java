package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx1 {
    public static void main(String[] args) {
        HashSet set = new HashSet(); //set은 순서가 없고 중복 허용 불가
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(1);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(set.contains(3)); //set 포함 여부
        set.clear(); //set 초기화
        System.out.println(set);
    }
}
