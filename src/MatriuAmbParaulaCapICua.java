import java.util.Scanner;

public class MatriuAmbParaulaCapICua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String[][] words = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                words[i][j] = scanner.next();
            }
        }

        int y = scanner.nextInt();
        int x = scanner.nextInt();

        String word = words[y][x];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
