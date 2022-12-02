package OOP;


public class ObjectArr {
    public static void main(String[] args) {
        TvObj[] tvArr = new TvObj[3];

        for (int i=0; i < tvArr.length; i++) {
            tvArr[i] = new TvObj();
            tvArr[i].channel = i + 10;
        }

        for (int i=0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d] channel: %d%n", i, tvArr[i].channel);
        }
    }
}

class TvObj {
    String color;
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}