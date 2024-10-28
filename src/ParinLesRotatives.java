import java.util.Scanner;

public class ParinLesRotatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] nums = new int[amount];
        for (int i = 0; i < amount; i++) {
            nums[i] = scanner.nextInt();
        }

        int rotations = scanner.nextInt();
        for (int i = 0; i < rotations; i++) {
            System.out.print(nums[i % amount] + " ");
        }
    }
}
