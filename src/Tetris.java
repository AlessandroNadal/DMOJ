import java.util.Scanner;

public class Tetris {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            boolean allOnes = true;
            int[] nums = new int[columns];
            for (int j = 0; j < columns; j++) {
                int n = scanner.nextInt();
                if (n != 1) {
                    allOnes = false;
                }

                nums[j] = n;
            }

            if (allOnes) continue;
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
