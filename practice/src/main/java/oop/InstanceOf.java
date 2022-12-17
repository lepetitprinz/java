package oop;

public class InstanceOf {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("This is a oop.FireEngine instance");
        }

        if (fe instanceof CarNew) {
            System.out.println("This is a oop.Car instance");
        }

        if (fe instanceof Object) {
            System.out.println("This is a Object instance");
        }

        System.out.println(fe.getClass().getName());
    }
}

class CarNew {}
class FireEngine extends CarNew {}