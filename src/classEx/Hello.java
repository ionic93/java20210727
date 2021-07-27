package classEx;

public class Hello {
    String greeting = "hello";
    int num1 = 10;
    int num2 = 20;
    int total = (num1 <20)?1:0;

    void greet(){
        if(greeting == "hello"){

        }
        System.out.println("Hello World~!");
    }

    public static void main(String[] args) {
        Hello h1 = new Hello();
        h1.greet();
        Foo foo = new Foo();
        foo.sleep();
        System.out.println(foo);
        System.out.println(h1);
        System.out.println();
    }
}
