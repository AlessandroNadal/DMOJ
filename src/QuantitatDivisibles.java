import java.util.Scanner;

public class QuantitatDivisibles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] nums = new int[amount];
        for (int i = 0; i < amount; i++) {
            nums[i] = scanner.nextInt();
        }

        int divisor = scanner.nextInt();
        int count = 0;
        for (int num : nums) {
            if (num % divisor == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
