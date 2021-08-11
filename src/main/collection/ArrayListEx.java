package main.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(0); // list 추가
        list.add("1");
        list.add(true);
        list.add(new Date());
        list.add(4);
        ArrayList list2 = new ArrayList(list.subList(1,3)); //sublist(index,index) 첫번째 인덱스부터 두번째 인덱스 바로 앞까지만 출력
        System.out.println(list2);
        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
//            System.out.println(list.get(i) instanceof Date?"O":"X");
        }
        System.out.println(list.indexOf(new Date()));
        list.remove(3); // list 삭제
        list.set(2, 2); // list 업데이트 list.set(index,value)
        list.set(1, 1); // list 업데이트
        System.out.println(list.toString());
        Comparator comp = new Comparator() {//사용자 정의로 정렬하고 싶을때 Comparator를 사용한다
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Comparable && o2 instanceof Comparable) {//Comparable은 compareTo를 가지고 있다.
                    Comparable c1 = (Comparable) o1;
                    Comparable c2 = (Comparable) o2;
                    return c1.compareTo(c2)*-1;
                }
                return -1;
            }
        };
//        list.sort(comp);
        Collections.sort(list,comp);//사용자 정의로 설정한 Comparator를 인자로 넣는다.
        System.out.println(list.toString());
    }
}
