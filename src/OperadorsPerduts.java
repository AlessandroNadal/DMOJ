import java.util.Scanner;

public class OperadorsPerduts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = scanner.nextInt();

        String op;
        if (a + b == result) op = "+";
        else if (a - b == result) op = "-";
        else if (a * b == result) op = "*";
        else if (b != 0 && a / b == result) op = "/";
        else if (b != 0 && a % b == result) op = "%";
        else op = "IMPOSSIBLE";
        System.out.println(op);
    }
}
