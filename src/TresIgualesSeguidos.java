import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TresIgualesSeguidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            int last1 = -1;
            int last = -1;

            ArrayList<Integer> nums = new ArrayList<>();
            while (true) {
                int n = scanner.nextInt();
                if (n == 0) {
                    break;
                }

                nums.add(n);
            }

            boolean equals = false;
            for (Integer n : nums) {
                if (last1 == n && last == n) {
                    equals = true;
                    break;
                } else {
                    last1 = last;
                    last = n;
                }
            }

            System.out.println(equals ? "SI" : "NO");
        }
    }
}
