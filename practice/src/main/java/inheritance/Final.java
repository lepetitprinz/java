package inheritance;

class CardFinal {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    CardFinal(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    CardFinal() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class Final {
    public static void main(String[] args) {
        CardFinal c = new CardFinal("HEART", 10);
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
