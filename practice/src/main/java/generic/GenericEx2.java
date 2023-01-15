package generic;

import java.util.ArrayList;

class Fruit2 implements Eatable {
    public String toString() { return "Fruit2"; }
}

class Apple2 extends Fruit2 { public String toString() { return "Apple2"; }}
class Grape2 extends Fruit2 { public String toString() { return "Grape2"; }}
class Toy2 { public String toString() { return "Toy2"; }}

interface Eatable {}

public class GenericEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit2> fruit2Box = new FruitBox<>();
        FruitBox<Apple2> apple2Box = new FruitBox<>();
        FruitBox<Grape2> grape2Box = new FruitBox<>();

        fruit2Box.add(new Fruit2());
        fruit2Box.add(new Apple2());
        fruit2Box.add(new Grape2());
        apple2Box.add(new Apple2());
        grape2Box.add(new Grape2());

        System.out.println("fruitBox: " + fruit2Box);
        System.out.println("fruitBox: " + apple2Box);
        System.out.println("fruitBox: " + grape2Box);
    }
}

class FruitBox<T extends Fruit2 & Eatable> extends Box<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item); }
    T get(int i) {return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}