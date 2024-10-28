import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        int b = 1;

        int amount = scanner.nextInt();
        if (amount == 1) {
            System.out.println(1);
            return;
        }

        System.out.print(a + " ");
        for (int i = 0; i < amount - 1; i++) {
            System.out.print(b + " ");
            int temp = a;
            a = b;
            b = a + temp;
        }
    }
}
