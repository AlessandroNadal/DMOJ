import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TresEnRalla {
    public static boolean checkBoard(ArrayList<ArrayList<Integer>> board, int check) {
        for (int i = 0; i < 3; i++) {
            boolean row = board.get(i).stream().allMatch(n -> n == check);
            if (row) return true;

            int finalI = i;
            boolean column = IntStream.range(0, 3).allMatch(n -> board.get(n).get(finalI) == check);
            if (column) return true;
        }

        boolean diagonal1 = IntStream.range(0, 3).allMatch(n -> board.get(n).get(n) == check);
        if (diagonal1) return true;

        boolean diagonal2 = IntStream.range(0, 3).allMatch(n -> board.get(2 - n).get(n) == check);
        return diagonal2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> board = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>(3);
            for (int j = 0; j < 3; j++) {
                row.add(scanner.nextInt());
            }
            board.add(row);
        }

        if (checkBoard(board, 1)) {
            System.out.println("Jugador1");
        } else if (checkBoard(board, 2)) {
            System.out.println("Jugador2");
        } else {
            System.out.println("Empat");
        }
    }
}
