package enum_method;

enum Transportation {
    BUS(100) { int fare(int distance) { return distance * BASIC_FARE; }},
    TRAIN(150) { int fare(int distance) { return distance * BASIC_FARE; }},
    SHIP(100) { int fare(int distance) { return distance * BASIC_FARE; }},
    AIRPLANE(300) { int fare(int distance) { return distance * BASIC_FARE; }};

    protected final int BASIC_FARE;

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBasicFare() { return BASIC_FARE; }

    abstract int fare(int distance);
}

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus: " + Transportation.BUS.fare(100));
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
