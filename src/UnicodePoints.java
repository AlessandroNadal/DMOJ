import java.util.Scanner;

public class UnicodePoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            char c = Character.toChars(scanner.nextInt())[0];
            System.out.print(c);
        }
    }
}
