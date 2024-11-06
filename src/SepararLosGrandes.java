import java.util.ArrayList;
import java.util.Scanner;

public class SepararLosGrandes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] nums = new int[amount];
        for (int i = 0; i < amount; i++) {
            nums[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> bigger = new ArrayList<>();

        for (int num : nums) {
            if (num <= n) smaller.add(num);
            else  bigger.add(num);
        }

        for (Integer i : smaller) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Integer i : bigger) {
            System.out.print(i + " ");
        }
    }
}
