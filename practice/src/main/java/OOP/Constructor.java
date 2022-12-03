package OOP;

class Car {
    String color;
    String gearType;
    int door;

    Car() {}
    Car(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("grey","custom",2);

        System.out.printf("Color: %s, Gear Type: %s, Door: %d%n", c1.color, c1.gearType, c1.door);
        System.out.printf("Color: %s, Gear Type: %s, Door: %d%n", c2.color, c2.gearType, c2.door);
    }
}
