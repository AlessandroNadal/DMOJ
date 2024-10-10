import java.util.ArrayList;
import java.util.Scanner;

public class Superposicio {
    public static ArrayList<ArrayList<Integer>> getBoard(Scanner scanner, int height, int width) {
        ArrayList<ArrayList<Integer>> board = new ArrayList<>(height);
        for (int i = 0; i < height; i++) {
            ArrayList<Integer> row = new ArrayList<>(width);
            for (int j = 0; j < width; j++) {
                row.add(scanner.nextInt());
            }
            board.add(row);
        }

        return board;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        ArrayList<ArrayList<Integer>> board1 = getBoard(scanner, height, width);
        ArrayList<ArrayList<Integer>> board2 = getBoard(scanner, height, width);

        String type = scanner.next();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int val1 = board1.get(y).get(x);
                int val2 = board2.get(y).get(x);

                switch (type) {
                    case "ADD":
                        board1.get(y).set(x, val1 + val2);
                        break;
                    case "NORMAL":
                        board1.get(y).set(x, val1 == 0 ? val2 : val1);
                        break;
                }
            }
        }

        for (ArrayList<Integer> values : board1) {
            values.forEach(n -> System.out.printf(n + " "));
            System.out.println();
        }
    }
}
