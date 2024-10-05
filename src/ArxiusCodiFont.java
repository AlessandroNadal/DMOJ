import java.util.ArrayList;
import java.util.Scanner;

public class ArxiusCodiFont {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> lines = new ArrayList<>(4);

        for (int i = 0; i < 4; i++) {
            String file = scanner.next();
            String type = scanner.next();
            String language = scanner.nextLine().trim();
            lines.add(type + " " + language + " " + file);
        }

        for (int i = 3; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}
