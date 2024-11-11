import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cubetris {
    public static int[][] readBoard(Scanner scanner, int height, int width) {
        int[][] board = new int[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                board[y][x] = scanner.nextInt();
            }
        }

        return board;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        int[][] board = readBoard(scanner, height, width);
        int[][] piece = readBoard(scanner, height, width);

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < piece.length; x++) {
                int a = board[y][x];
                int b = piece[y][x];

                if (a != 0) {
                    if (b != 0) {
                        for (int[] i : board) {
                            for (int j : i) {
                                System.out.print(j + " ");
                            }
                            System.out.println();
                        }
                        return;
                    }

                    piece[y][x] = board[y][x];
                }
            }
        }

        for (int[] i : piece) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
