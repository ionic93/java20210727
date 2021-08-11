package main.operator;
import static java.lang.Math.*;
public class Exercise01 {
    public static void main(String[] args) {
        //3-1
        byte b = 10;
        long l = 1000L;
        int i = 100;
        char ch = 'A';

        b=(byte)i; //생략 불가 큰 -> 작
        ch=(char)b; //생략 불가 (음수) -128~127 -> 0~65535
        short s = (short)ch; //생략 불가(값이 초과) 0~65535 -> -32768 ~ +32767
        float f = (float)l; //생략 가능 float가 long보다 표현범위가 더 넓기 때문
        i = (int)ch;
        //3-3
        int num = 456;
        System.out.println((num/100)*100);
        System.out.println((int)(floor(num/pow(10,2))*pow(10,2)));
        //3-4
        int numOfApples = 123;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket>0?1:0);
//        int numOfBucket = (int)ceil((float)numOfApples/sizeOfBucket);
        System.out.println("필요한 바구니 수 :"+numOfBucket);
        //3-5
        int number = 10;
        System.out.println(number>0?"양수":(number<0?"음수":0));
        //3-6
        int fahrenheit = 100;
        float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5)/100f;

        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}
