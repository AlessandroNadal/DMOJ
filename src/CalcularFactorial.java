import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int v = 1;
        for (int i = 1; i <= n; i++) {
            v *= i;
        }
        System.out.println(v);
    }
}
