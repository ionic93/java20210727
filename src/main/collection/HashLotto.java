package main.collection;

import java.util.*;

public class HashLotto {
    public static void main(String[] args) {
        HashSet set = new HashSet(); //set은 순서가 없고 중복 허용 불가

        while (set.size() < 6) {
           int rand = (int)((Math.random()*45)+1);
            set.add(rand);
        }
        System.out.println(set);

//        Iterator it = set.iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next());
//        }
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
