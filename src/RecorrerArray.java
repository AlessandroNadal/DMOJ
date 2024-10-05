import java.util.ArrayList;
import java.util.Scanner;

public class RecorrerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        ArrayList<String> words = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            words.add(scanner.next());
        }

        String match = scanner.next();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(match)) {
                System.out.println(i+1);
            }
        }
    }
}
