package lang;

public class ObjectEqualsEx {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1);
        System.out.println(v2);
        if (v1.equals(v2)) {
            System.out.println("같습니다");
        }else {
            System.out.println("다릅니다");
        }
    }
}

class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Value) {
            Value value = (Value) obj; //자부자 형변환
            if (value.value == this.value) {
                return true;
            }
        }
        return result;
    }
}