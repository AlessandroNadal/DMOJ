import java.util.HashMap;
import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Integer> count = new HashMap<>();
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            int n;
            while ((n=scanner.nextInt())!=0) {
                count.putIfAbsent(n, 0);

                count.put(n, count.get(n)+1);
            }
        }

        for (int i = 1; i <= 9; i++) {
            Integer n = count.get(i);
            if (n == null) n = 0;

            System.out.printf("%d:", i);
            for (int j = 0; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
