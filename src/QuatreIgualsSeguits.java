import java.util.Scanner;

public class QuatreIgualsSeguits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = -1;
        int num = -1;

        int nums = 0;

        int n;
        while ((n = scanner.nextInt()) != -1) {
            if (count == -1 || num == -1) {
                count = 1;
                num = n;
                continue;
            }

            if (n == num) {
                count++;
                if (count >= 4) {
                    nums++;
                }
                continue;
            }

            num = n;
            count = 1;
        }

        System.out.println(nums);
    }
}
