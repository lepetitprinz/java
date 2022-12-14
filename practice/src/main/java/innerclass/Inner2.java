package innerclass;

public class Inner2 {
    class InstanceInner {}
    static class StaticInner {}

    InstanceInner iv = new InstanceInner();
    static StaticInner cv = new StaticInner();

    static void staticMethod() {
        // InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        Inner2 outer = new Inner2();
        InstanceInner obj1 = outer.new InstanceInner();
    }
    void instanceMethod() {
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
    }

    void myMethod() {
        class LocalInner {}
        LocalInner iv = new LocalInner();
    }
}
