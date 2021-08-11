package main.object1;

public class CardEx {
    public static void main(String[] args) {
        String[] cardType = {"SPADE", "CLOVER", "DIAMOND", "HEARD"};
        //배열을 생성자로 초기화하면 기본값 null들을 가진다.
        Card[] cards = new Card[52];
        for (int i = 0; i < cards.length; i++) {
            //JVM이 new를 만나는 순간 알아서 인스턴스를 생성(초기화)해준다
            //하지만 내가 따로 public card(){}를 선언하면 JVM이 만들어둔 인스턴스가 사라짐
            cards[i] = new Card(i%13+1,cardType[i/13]); //new 생성자를 만나서 값들이 null로 초기화되고 Card()클래스 안에 있는 멤버변수들에 값이 넣어짐
//      cards[i].setNumber(i%13);
//      cards[i].setKind(cardType[i/13]);
            System.out.println(cards[i]);
        }
    }
}

class Card{
    private int number;  //private 변수는 외부로부터 접근을 막는다 => 객체의 온전한 값을 보존
    private String kind;
    static int width=100;
    static int height=150;
    //  public Card(){}
    public Card(int number, String kind){
        this.number = number;
        this.kind = kind;
    }

    public int getNumber() {
        return number;
    }
//number의 기본값을 설정함
    public void setNumber(int number) {
        if(number>0 && number<14) {
            this.number = number;
        } else {
            System.out.println("숫자의 범위를 넘어섭니다");
        }
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override //참조 변수의 조상인 Object()의 기본 메서드인 toString()을 빌려온다
    public String toString() {
        return number+"/"+kind;
    }
}