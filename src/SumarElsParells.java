import java.util.Scanner;

public class SumarElsParells {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            int n = scanner.nextInt();
            if (n % 2 == 0) sum+=n;
        }
        System.out.println(sum);
    }
}
