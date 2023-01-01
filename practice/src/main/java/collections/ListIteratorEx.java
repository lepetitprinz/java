package collections;

import java.util.*;
public class ListIteratorEx {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "3", "4","5"));

        ListIterator it = list.listIterator();

        while(it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();

        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println();
    }
}
