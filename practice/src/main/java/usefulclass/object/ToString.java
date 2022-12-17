package usefulclass.object;

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }
    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}

class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);
    }
    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind: " + kind + ", number: " + number;
    }
}

public class ToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        Card2 c3 = new Card2();
        Card2 c4 = new Card2("Heart", 7);

        System.out.println(c3.toString());
        System.out.println(c4.toString());
    }
}
