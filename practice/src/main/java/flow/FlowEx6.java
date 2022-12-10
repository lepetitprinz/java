package flow;

import java.util.*;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.println("Insert the registration number");

        Scanner scanner = new Scanner(System.in);
        String regitNum = scanner.nextLine();

        char gender = regitNum.charAt(7);

        switch (gender) {
            case '1': case '3':
                System.out.println("You are man");
                break;
            case '2': case '4':
                System.out.println("You are woman");
                break;
            default:
                System.out.println("Number is not validated");
        }
    }
}
