package oop;

public class Overloading {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        System.out.println("add result: " + mm.add(3, 3));
        System.out.println("add result: " + mm.add(3L, 3L));

        int[] a = {10, 20, 30, 40, 50};
        System.out.println("add result: " + mm.add(a));
    }
}

class MyMath {
    int add(int a, int b) {
        return a + b;
    }

    long add(long a, long b) {
        return a + b;
    }

    int add(int[] a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }

        return result;
    }
}