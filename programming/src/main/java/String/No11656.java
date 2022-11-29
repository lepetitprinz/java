package String;

import java.util.*;

public class No11656 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> inputTreeSet = new TreeSet<String>();
        inputTreeSet.add(input);
        int inputLen = input.length();
        for (int i=0; i <= inputLen; i++) {
            inputTreeSet.add(input.substring(i, inputLen));
        }

        for (String s : inputTreeSet) {
            System.out.printf("%s%n", s);
        }
    }
}
