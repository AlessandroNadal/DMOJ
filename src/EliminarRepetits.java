import java.util.ArrayList;
import java.util.Scanner;

public class EliminarRepetits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        ArrayList<String> words = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            String word = scanner.next();
            if (!words.contains(word)) {
                words.add(word);
            }
        }

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
