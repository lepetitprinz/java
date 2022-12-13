package interfaceclass;

public class Interface {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit)
            System.out.println("f is chlid of Unit class");

        if (f instanceof Fightable)
            System.out.println("f implement Fightable interface");

        if (f instanceof Movable)
            System.out.println("f implement Movable interface");

        if (f instanceof Attackable)
            System.out.println("f implement Attackable interface");

        if (f instanceof Object)
            System.out.println("f is chlid of Object class");
    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {}
    public void attack(Unit u) {}
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable { }
interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }