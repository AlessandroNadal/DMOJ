import java.util.ArrayList;
import java.util.Scanner;

public class Cubetris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        ArrayList<ArrayList<Integer>> board = new ArrayList<>(height);
        for (int i = 0; i < width; i++) {
            ArrayList<Integer> row = new ArrayList<>(width);
            for (int j = 0; j < width; j++) {
                row.add(scanner.nextInt());
            }
            board.add(row);
        }
        System.out.println(board);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                board.get(y).set(x, scanner.nextInt());
            }
        }

        System.out.println(board);
    }
}
