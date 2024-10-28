import java.util.ArrayList;
import java.util.Scanner;

public class BarrelCannon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] barrels = new int[amount];
        for (int i = 0; i < amount; i++) {
            barrels[i] = scanner.nextInt();
        }

        int pos = scanner.nextInt();
        ArrayList<Integer> visited = new ArrayList<>();
        while (true) {
            if (pos > amount-1) {
                System.out.println("DERECHA");
                return;
            } else if (pos < 0) {
                System.out.println("IZQUIERDA");
                return;
            }

            if (visited.contains(pos)) {
                System.out.println("BUCLE");
                return;
            }

            visited.add(pos);
            pos += barrels[pos];
        }
    }
}
