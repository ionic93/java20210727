package object2;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for (int i = 0; i < cards.length; i++) {
            int num = i%10+1;
            boolean isKwang = (i<10)&&(num==1||num==3||num==8);

            cards[i] = new SutdaCard(num,isKwang);
        }
    }
    void shuffle(){
        for (int i = 0; i < cards.length; i++) {
        int rand = (int)(Math.random()* cards.length);
            SutdaCard tmp = cards[i];
            cards[i]=cards[rand];
            cards[rand]=tmp;
        }
    }
    SutdaCard pick(int index){
        return cards[index];
    }
    SutdaCard pick(){
        int rand = (int)(Math.random()*cards.length);
        return cards[rand];
    }

}
class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    //info()대신 Object클래스의 toString()을 오버라이딩
    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
public class Ex7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        
        for (int i = 0; i < deck.cards.length; i++) {
            if(i!=0) System.out.printf(",");
            System.out.print(deck.cards[i]);
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
