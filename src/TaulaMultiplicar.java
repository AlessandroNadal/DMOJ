import java.util.Scanner;

public class TaulaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i<=b; i++) {
            for (int n = 0; n<=10; n++) {
                System.out.printf("%d x %d = %d\n", i, n, i*n);
            }
        }
    }
}
