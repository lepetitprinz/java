package OOP;

class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product() {}
}

public class InitializationTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("Serial Number of p1: " + p1.serialNo);
        System.out.println("Serial Number of p2: " + p2.serialNo);
        System.out.println("Serial Number of p3: " + p3.serialNo);

    }
}
