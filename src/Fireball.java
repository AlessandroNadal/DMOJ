import java.util.Scanner;

public class Fireball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] enemies = new int[amount];
        for (int i = 0; i < amount; i++) {
            enemies[i] = scanner.nextInt();
        }

        while (true) {
            int pos = scanner.nextInt();
            int size = scanner.nextInt();
            int damage = scanner.nextInt();

            if (pos == -1) break;

            for (int i = Math.max(0, pos - size); i < Math.min(enemies.length, pos + size + 1); i++) {
                enemies[i] -= damage;
            }
            for (int enemy : enemies) {
                System.out.print(Math.max(0, enemy) + " ");
            }
            System.out.println();
        }
    }
}
