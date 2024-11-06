import java.util.Scanner;

public class CuantasVecesPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        String[] words = new String[amount];
        for (int i = 0; i < amount; i++) {
            words[i] = scanner.next();
        }

        String word = scanner.next();
        int count = 0;
        for (String s : words) {
            if (word.equals(s)) count++;
        }

        System.out.println(count);
    }
}
