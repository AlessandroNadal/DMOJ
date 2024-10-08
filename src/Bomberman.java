import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Bomberman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        ArrayList<ArrayList<Integer>> board = new ArrayList<>(height);
        for (int y = 0; y < height; y++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int x = 0; x < width; x++) {
                row.add(scanner.nextInt());
            }
            board.add(row);
        }

        int num = scanner.nextInt();
        int nx = -1;
        int ny = -1;
        for (int y = 0; y < board.size(); y++) {
            for (int x = 0; x < board.size(); x++) {
                if (board.get(y).get(x) == num) {
                    nx = x;
                    ny = y;
                }
            }
        }


        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(ny == y || nx == x ? "@" : "#");
            }
            System.out.println();
        }
    }
}
