package main.lang;

public class StringBufferEx {
    public static void main(String[] args) {
        String str = "ab";
        System.out.println(str.hashCode());
        System.out.println(System.identityHashCode(str));
        str = "abc";
        System.out.println(str.hashCode()); //문자를 추가하면 주소값이 달라짐
        System.out.println(System.identityHashCode(str));
        System.out.println();

        StringBuffer sb = new StringBuffer("ab");
        System.out.println(sb);
        System.out.println(sb.hashCode());
        System.out.println(System.identityHashCode(sb));
        sb.append("c");
        System.out.println(sb);
        System.out.println(sb.hashCode()); //c를 추가했음에도 주소값이 변경되지 않음
        System.out.println(System.identityHashCode(sb));
        System.out.println();

        StringBuffer sb2 = new StringBuffer(20);
        StringBuffer sb3 = new StringBuffer();
        sb3.append("h");
        sb3.append("e");
        sb3.append("l");
        sb3.append(true);
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());
        sb3.append("world premier League");
        System.out.println(sb3.capacity());
        System.out.println(sb3);
        System.out.println(sb3.delete(0,4));
        System.out.println(sb3.deleteCharAt(0));
        System.out.println(sb3.deleteCharAt(0));
        System.out.println(sb3.deleteCharAt(0));
        System.out.println(sb3.insert(6,"star "));
        System.out.println(sb3.reverse());
        System.out.println(sb3); //StringBuffer는 전부 원본에 반영이 된다
        sb3.setCharAt(sb3.length()-1,'W');
        System.out.println(sb3.reverse());
        sb3.setLength(5);
        System.out.println(sb3);

    }
}
