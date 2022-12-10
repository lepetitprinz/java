package oop;

class CarThis {
    String color;
    String gearType;
    int door;

    CarThis() {
        this("white", "auto", 4);
    }

    CarThis(String color) {
        this(color, "auto", 4);
    }

    CarThis(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class ConstructorThis {
    public static void main(String[] args) {
        CarThis c1 = new CarThis();
        CarThis c2 = new CarThis("blue");

        System.out.printf("Color: %s, Gear Type: %s, Door: %d%n", c1.color, c1.gearType, c1.door);
        System.out.printf("Color: %s, Gear Type: %s, Door: %d%n", c2.color, c2.gearType, c2.door);
    }
}
