import java.util.ArrayList;
import java.util.Scanner;

public class BlockPuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        ArrayList<ArrayList<Integer>> board = new ArrayList<>(height);
        for (int i = 0; i < height; i++) {
            ArrayList<Integer> row = new ArrayList<>(width);
            for (int j = 0; j < width; j++) {
                row.add(scanner.nextInt());
            }
            board.add(row);
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int val = scanner.nextInt();
                if (board.get(y).get(x) == 1 && val == 1) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }
}
