package Object1;

public class Exercise6_1 {
    public static void main(String[] args) {
        Student s = new Student("홍길동",1,1,100,60,76);

        String str = s.info();
        System.out.println(str);

    }
}
//6-2
class Student{
    private String name;
    private int ban,no,kor,eng,math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info(){
        return name+","+ban+","+no+","+kor+","+eng+","+math+","
                +(kor+eng+math)+","
                +((int)((kor+eng+math)/3f*10+0.5f)/10f);
    }

}