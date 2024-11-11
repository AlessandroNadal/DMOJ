import java.util.HashMap;
import java.util.Scanner;

public class FontanaDiPuig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> coins = new HashMap<>();
        coins.put(200, 0);
        coins.put(100, 0);
        coins.put(50, 0);
        coins.put(20, 0);
        coins.put(10, 0);
        coins.put(5, 0);

        int n;
        int last = -1;
        while ((n = scanner.nextInt()) != 0) {
            int i = 0;
            if (last == -1) {
                i = n;
            } else {
                i = n - last;
            }

            coins.put(i, coins.get(i)+1);
            last = n;
        }

        for (Object i : coins.keySet().stream().sorted().toArray()) {
            System.out.printf("%d) %d\n", i, coins.get(i));
        }
    }
}
