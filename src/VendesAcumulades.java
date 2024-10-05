import java.util.ArrayList;
import java.util.Scanner;

public class VendesAcumulades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int sum = 0;
        ArrayList<Integer> previous = new ArrayList<>();
        for (int i = 0; i<amount; i++) {
            int n = scanner.nextInt();
            sum += n;
            previous.add(sum);
        }

        System.out.println(previous);
    }
}
