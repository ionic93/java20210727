package main.operator;

public class Op_Elvis {
    public static void main(String[] args) {
        int x = -5;
        int absX = x>=0?x:-x;
        System.out.println("절대값: "+absX);
        char singX = (x>0)?'+':(x==0)?' ':'-';
        System.out.printf("x = %c%d %n",singX, absX);
    }
}
