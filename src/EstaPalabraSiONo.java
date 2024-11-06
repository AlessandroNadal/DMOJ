import java.util.Scanner;

public class EstaPalabraSiONo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        String[] words = new String[amount];
        for (int i = 0; i < amount; i++) {
            words[i] = scanner.next();
        }

        String match = scanner.next();
        for (String word : words) {
            if (word.equals(match)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
