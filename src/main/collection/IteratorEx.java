package main.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator it = list.iterator();
        while (it.hasNext()) { //it이 있냐고 물어본 후 있으면 출력
            System.out.println(it.next());
        }
        //Iterator는 한번 적용하면 데이터 끝에 위치하기 때문에 다시 초기화해야함.
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
