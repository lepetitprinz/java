package OOP;

public class VariableArgs {
    public static void main(String[] args) {
        String[] strArr = { "100", "200", "300" };

        System.out.println(concatenate(" ", strArr));
    }

    static StringBuilder concatenate(String delim, String... args) {
        StringBuilder result = new StringBuilder();

        for (String str : args) {
            result.append(str).append(delim);
        }

        return result;
    }

    static StringBuilder concatenate(String... args) {
        return concatenate("", args);
    }
}
