import java.util.Scanner;

public class BombermanBlocsDestruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        int size = scanner.nextInt();

        int count = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (!scanner.next().equals("X")) continue;
                if (!(y == by || x == bx)) {
                    continue;
                }

                if (y == by && x >= bx - size && x <= bx + size) count++;
                if (x == bx && y >= by - size && y <= by + size) count++;
            }
        }

        System.out.println(count);
    }
}
