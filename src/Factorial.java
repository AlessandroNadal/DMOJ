import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(factorial(n, n-1));
    }

    public static int factorial(int n, int current) {
        if (current == 0) {
            return n;
        }

        return factorial(n*(current), current-1);
    }
}
