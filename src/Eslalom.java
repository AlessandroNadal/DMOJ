import java.util.Locale;
import java.util.Scanner;

public class Eslalom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);
        int amount = 0;
        while (scanner.next().equals("BANDERÍ")) {
            amount++;
        }

        for (int i = 1; i < amount+1; i++) {
            System.out.println("BANDERÍ " + i);
        }
    }
}
