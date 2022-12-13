package interfaceclass;

class A {
    void autoPlay(I i) {
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B implements I {
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I {
    public void play() {
        System.out.println("play in C class");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        A a = new A();  // user
        a.autoPlay(new B());
        a.autoPlay(new C());
    }
}
