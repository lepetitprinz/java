package oop;

class Block {
    static {
        System.out.println("static {}");
    }
    {
        System.out.println("{ }");
    }
    public Block() {
        System.out.println("Constructor");
    }
}

public class InitializationBlock {
    public static void main(String[] args) {
        System.out.println("Block block = new Block(); ");
        Block block = new Block();

        System.out.println("Block block2 = new Block(); ");
        Block block2 = new Block();
    }
}
