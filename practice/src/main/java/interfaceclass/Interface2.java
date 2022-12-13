package interfaceclass;

public class Interface2 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropship);
    }
}

interface Repairable {}

class UnitTR {
    int hitPoint;
    final int MAX_HP;
    UnitTR (int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit extends UnitTR {
    GroundUnit(int hp) {
        super(hp);
    }
}

class AirUnit extends UnitTR {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        this.hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable {
    Dropship() {
        super(125);
        this.hitPoint = MAX_HP;
    }

    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(40);
        this.hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        this.hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof UnitTR) {
            UnitTR u = (UnitTR)r;
            while (u.hitPoint!=u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u.toString() + "is repaired.");
        }
    }
}