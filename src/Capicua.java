import java.util.ArrayList;
import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();

        ArrayList<Integer> values = new ArrayList<>(5);
        for (int i = 0; i < amount; i++) {
            values.add(scanner.nextInt());
        }

        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = values.size() - 1; i >= 0; i--) {
             reversed.add(values.get(i));
        }

        System.out.println(values.equals(reversed) ? "SI" : "NO");
    }
}
