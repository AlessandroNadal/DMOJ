import java.util.Scanner;

public class QuadratsNaturals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        for (int i = 1; i <= amount; i++) {
            System.out.printf("%d^2 = %d\n", i, (int) Math.pow(i, 2));
        }
    }
}
