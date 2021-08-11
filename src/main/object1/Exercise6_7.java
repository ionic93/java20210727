package main.object1;

public class Exercise6_7 {
    public static void main(String[] args) {
        Marine marine = new Marine();
        System.out.println(marine.weapon);
        Marine marine2 = new Marine();
        System.out.println(marine2.weapon);
    }
}
class Marine {
int x=0, y=0;
int hp = 60;
static int weapon = 6;
static int armor = 0;

static void weaponUp(){
    //클래스 멤버(static이 붙어 있는 메서드)에는 사용 안됨.
//    this.weapon++;
    weapon++;
}
static void armorUp(){
//    this.armor++;
    armor++;
    }
void move(int x, int y){
    this.x = x;
    this.y = y;
}
}
