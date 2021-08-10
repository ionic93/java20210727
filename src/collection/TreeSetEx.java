package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(); //TreeSet은  Hashset과 다르게 정렬되어서 출력

        while (set.size() < 6) {
            int rand = (int)((Math.random()*45)+1);
            set.add(rand);
        }
        System.out.println(set);
    }
}
