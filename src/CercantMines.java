import java.util.ArrayList;
import java.util.Scanner;

public class CercantMines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        ArrayList<ArrayList<Integer>> board = new ArrayList<>(height);

        for (int y = 0; y < height; y++) {
            ArrayList<Integer> row = new ArrayList<>(width);
            for (int x = 0; x < width; x++) {
                row.add(scanner.nextInt());
            }

            board.add(row);
        }

        while (true) {
            int y = scanner.nextInt();
            int x = scanner.nextInt();

            if (y == 0) {
                break;
            }

            System.out.println(board.get(y-1).get(x-1) == 1 ? "SI":"NO");
        }
    }
}
