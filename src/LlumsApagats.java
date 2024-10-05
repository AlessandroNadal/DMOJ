import java.util.Scanner;

public class LlumsApagats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if (scanner.nextBoolean()) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
