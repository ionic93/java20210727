package collection;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10)); //인스턴스는 안의 내용이 같아도 주소값이 다르기 때문에 다르다고 인식한다
        set.add(new Person("David",10));
        System.out.println(set);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {return name+":"+age;}

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  Person)){return false;}
        Person p = (Person) obj;
        return name.equals(p.name) && age==p.age;
    }
}
