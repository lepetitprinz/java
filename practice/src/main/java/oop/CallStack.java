package oop;

public class CallStack {
    public static void main(String[] args) {
        System.out.println("main(String[] args) start");
        firstMethod();
        System.out.println("main(String[] args) end");
    }

    static void firstMethod() {
        System.out.println("firstMethod() start");
        secondMethod();
        System.out.println("firstMethod() end");
    }

    static void secondMethod() {
        System.out.println("secondMethod() start");
        System.out.println("secondMethod() end");
    }
}
