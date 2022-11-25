package Flow;

import java.util.*;

public class FlowEx5 {
    public static void main(String[] args) {
        System.out.println("Insert the current month");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("Current season is spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Current season is summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Current season is fall");
                break;
            default:
                System.out.println("Current season is winter");
        }
    }
}
