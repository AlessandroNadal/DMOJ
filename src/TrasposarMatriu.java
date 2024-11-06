import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TrasposarMatriu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] matrix = new int[x][y];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                matrix[j][i] = scanner.nextInt();
            }
        }

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
