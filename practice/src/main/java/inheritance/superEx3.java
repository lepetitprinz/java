package inheritance;

public class superEx3 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
        System.out.println(p3.getLocation());
    }
}

class Point2 extends Object {
    int x, y;

    Point2(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point2 {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + ", z: " + z;
    }
}