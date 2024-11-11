import java.util.Scanner;

public class SubstringMatriu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String[][] words = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                words[i][j] = scanner.next();
            }
        }

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (String[] line : words) {
            for (String word : line) {
                System.out.printf("%s ", start < end && start >= 0 && end < word.length() ? word.substring(start, end) : "<ERROR>");
            }
            System.out.println();
        }
    }
}
