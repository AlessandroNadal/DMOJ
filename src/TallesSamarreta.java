import java.util.Scanner;

public class TallesSamarreta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        String[] shirts = new String[amount];
        for (int i = 0; i < amount; i++) {
            shirts[i] = scanner.next();
        }

        String size = scanner.next();
        int count = 0;
        for (String shirt : shirts) {
            if (size.equals(shirt)) count++;
        }

        System.out.println(count);
    }
}
