package oop;

public class ClassVariable {
    public static void main(String[] args) {
        System.out.println("Card width: " + Card.width);
        System.out.println("Card height: " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 2;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 7;

        System.out.printf("c1 - kind: %s number: %d size: (%d, %d)%n",
                c1.kind, c1.number, Card.width, Card.height);
        System.out.printf("c2 - kind: %s number: %d size: (%d, %d)%n",
                c2.kind, c2.number, Card.width, Card.height);

        System.out.println("Change card width and height");
        Card.width = 50;
        Card.height = 80;

        System.out.printf("c1 - kind: %s number: %d size: (%d, %d)%n",
                c1.kind, c1.number, Card.width, Card.height);
        System.out.printf("c2 - kind: %s number: %d size: (%d, %d)%n",
                c2.kind, c2.number, Card.width, Card.height);
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}