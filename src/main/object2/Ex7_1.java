package main.object2;

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    } //매개변수가 없는 생성자

    SutdaCard(int num, boolean isKwang){ //매개변수가 있는 생성자 ☆ 5)
        this.num = num;
        this.isKwang = isKwang;
    }
    //info()대신 Object클래스의 toString()을 오버라이딩
    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    } //SutdaCard의 인스턴스 정보를 num으로 표현(광이 있다면 K를 붙임) 6)
}
class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM]; //SutdaCard를 크기가 20인 배열로 cards 인스턴스 생성[기본값 null] 2)

    SutdaDeck(){ //매개변수가 없는 생성자 ★ 3)
        for (int i = 0; i < cards.length; i++) {
            int num = i%10+1;
            boolean isKwang = (i<10)&&(num==1||num==3||num==8);

            cards[i] = new SutdaCard(num,isKwang); //for문을 돌면서 매개변수가 있는 SutdaCard()실행 ☆ 4)
        }
    }
    void shuffle(){//12)
        for (int i = 0; i < cards.length; i++) {
            int rand = (int)(Math.random()* cards.length);
            SutdaCard tmp = cards[i];
            cards[i]=cards[rand];
            cards[rand]=tmp;
        }
    }
    SutdaCard pick(int index){
        return cards[index];
    } //8), 16)
    SutdaCard pick(){//10)
        int rand = (int)(Math.random()*cards.length);
        return cards[rand];
    }

}
public class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck(); //SutaDeck을 deck이름으로 인스턴스 생성 ★붙인 생성자 실행 1)
        System.out.println(deck.pick(0)); //7)
        System.out.println(deck.pick());//9)
        deck.shuffle();//11)
        
        for (int i = 0; i < deck.cards.length; i++) {
            if(i!=0) System.out.printf(",");
            System.out.print(deck.cards[i]);//13)
        }
        System.out.println();//14)
        System.out.println(deck.pick(0));//15)
    }
}
