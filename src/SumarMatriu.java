import java.util.Scanner;

public class SumarMatriu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        for (int y = 0; y < rows; y++) {
            int sum = 0;
            for (int x = 0; x < columns; x++) {
                sum += scanner.nextInt();
            }
            System.out.println(sum);
        }
    }
}
