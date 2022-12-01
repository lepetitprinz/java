package Array;

public class CommandLine {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("usage: Number op Number");
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case 'x':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Not supported");
        }
        System.out.println("result: " + result);
    }
}
