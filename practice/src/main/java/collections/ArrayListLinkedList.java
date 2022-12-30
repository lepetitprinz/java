package collections;

import java.util.*;

public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(2000000);
        LinkedList<String> ll = new LinkedList<>();

        System.out.println("add1");
        System.out.println("ArrayList: " + add1(al));
        System.out.println("LinkedList: " + add1(ll));

        System.out.println("add2");
        System.out.println("ArrayList: " + add2(al));
        System.out.println("LinkedList: " + add2(ll));

        System.out.println("remove2");
        System.out.println("ArrayList: " + remove2(al));
        System.out.println("LinkedList: " + remove2(ll));

        System.out.println("remove1");
        System.out.println("ArrayList: " + remove1(al));
        System.out.println("LinkedList: " + remove1(ll));

    }

    public static long add1(List<String> list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            list.add(i + "");
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long add2(List<String> list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            list.add(500, "X");
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long remove1(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--)
            list.remove(i);
        long end = System.currentTimeMillis();

        return end - start;
    }

    public static long remove2(List<String> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++)
            list.remove(i);
        long end = System.currentTimeMillis();

        return end - start;
    }


}
