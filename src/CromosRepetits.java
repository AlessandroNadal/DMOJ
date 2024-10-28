import java.util.*;

public class CromosRepetits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        HashMap<Integer, Integer> cromos = new HashMap<>();
        for (int i = 0; i < amount; i++) {
            int n = scanner.nextInt();
            cromos.putIfAbsent(n, 0);
            cromos.put(n, cromos.get(n) + 1);
        }

        SortedSet<Integer> keys = new TreeSet<>(cromos.keySet());
        for (Integer key : keys) {
            if (cromos.get(key) < 2) continue;
            System.out.println(key + ": " + cromos.get(key));
        }
    }
}
