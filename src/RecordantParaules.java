import java.util.ArrayList;
import java.util.Scanner;

public class RecordantParaules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        ArrayList<String> words = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            String word = scanner.next();
            if (words.contains(word)) {
                System.out.println("antiga");
            } else {
                System.out.println("nova");
                words.add(word);
            }
        }
    }
}
