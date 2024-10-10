import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
    public static ArrayList<ArrayList<Character>> board;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        scanner.nextLine();

        int startX = 0;
        int startY = 0;

        Maze.board = new ArrayList<>(height);
        for (int y = 0; y < height; y++) {
            ArrayList<Character> row = new ArrayList<>();
            char[] line = scanner.nextLine().toCharArray();
            for (int x = 0; x < line.length; x++) {
                char c = line[x];
                if (c == '^') {
                    startX = x;
                    startY = y;
                }
                row.add(c);
            }
            board.add(row);
        }
        traverse(startX, startY);

        for (ArrayList<Character> characters : board) {
            for (Character character : characters) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public static boolean traverse(int x, int y) {
        if (x < 0 || x >= board.getFirst().size() || y < 0 || y >= board.size()) {
            return false;
        }

        char pos = board.get(y).get(x);
        if (pos == '#' || pos == 'o') {
            return false;
        } else if (pos == ' ' || pos == '^') {
            board.get(y).set(x, 'o');

            boolean any = traverse(x, y-1)
                    || traverse(x, y+1)
                    || traverse(x-1, y)
                    || traverse(x+1, y);

            if (!any) {
                board.get(y).set(x, ' ');
            }
            return any;
        } else if (pos == '_') {
            board.get(y).set(x, 'o');
            return true;
        }

        return false;
    }
}
