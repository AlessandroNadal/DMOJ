import java.util.Scanner;

public class TriangleSuperior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        for (int i = amount; i > 0; i--) {
            for (int j = 0; j < amount - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
            System.out.print(scanner.nextInt() + " ");
            }
            System.out.println();
        }
    }
}
