import java.util.ArrayList;
import java.util.Scanner;

public class Del1Al5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            ArrayList<Integer> nums = new ArrayList<>();
            int n;
            while ((n = scanner.nextInt()) != 0) {
                nums.add(n);
            }

            boolean all = true;
            for (int j = 1; j < 6; j++) {
                if (!nums.contains(j)) {
                    all = false;
                    break;
                }
            }

            System.out.println(all ? "SI" : "NO");
        }
    }
}
