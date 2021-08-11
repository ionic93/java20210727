package main.lang;

public class ObjectHashCodeEx {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 == str2); //인스턴스의 주소값이 다르기때문에 false
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str1.hashCode());

        System.out.println();

        String str3 = "abc";
        String str4 = "abc";
        System.out.println(str3 == str4); //Constant Pool에 등록된 문자열의 주소값이 같음
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
        System.out.println(str1.equals(str4)); //eqauls는 Consstant Pool을 참조

        str3 = "abcd";
        System.out.println(str3);
        System.out.println(str3.hashCode());
        System.out.println(System.identityHashCode(str3));

    }
}
