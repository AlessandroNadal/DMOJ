import java.util.Scanner;

public class EndrecarIEliminarRepetits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] nums = new int[amount];
        for (int i = 0; i < amount; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int var = nums[i];
                    nums[i] = nums[j];
                    nums[j] = var;
                }
            }
        }

        Integer last = null;
        for (int num : nums) {
            if (last == null) {
                last = num;
            } else if (last == num) {
                continue;
            }

            System.out.print(num + " ");
        }
    }
}
