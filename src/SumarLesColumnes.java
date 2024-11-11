import java.util.Scanner;

public class SumarLesColumnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        int[] sum = new int[width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                sum[x] += scanner.nextInt();
            }
        }

        for (int i : sum) {
            System.out.print(i + " ");
        }
    }
}
