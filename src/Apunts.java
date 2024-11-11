import java.util.HashMap;
import java.util.Scanner;

public class Apunts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, String> apunts = new HashMap<>();
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            int n = scanner.nextInt();
            String line = scanner.nextLine().strip();

            apunts.put(n, line);
        }

        for (int i = 1; i < amount+1; i++) {
            System.out.printf("%d %s\n", i, apunts.get(i));
        }
    }
}
