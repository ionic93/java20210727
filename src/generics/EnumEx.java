package generics;

public class EnumEx {
    public static void main(String[] args) {
        Directions d1 = Directions.EAST; //enum의 요소는 static 상수처럼 사용.
//        d1 = Directions.valueOf("EAST");
//        d1 = Enum.valueOf(Directions.class,"East");
        System.out.println(d1.name()+" = "+d1.ordinal());

        Directions[] dArr = Directions.values();
        for (Directions d : dArr) {
            System.out.printf("%s = %d %n",d.name(),d.ordinal());
        }
    }
}
enum Directions{EAST, SOUTH, WEST, NORTH}
class Direction{
    int east = 1;
    int west = 2;
    int south = 3;
    int north = 4;
}
