import java.util.ArrayList;
import java.util.Scanner;

public class AlturaMinima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        ArrayList<Float> kids = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            kids.add(scanner.nextFloat());
        }

        float minHeight = scanner.nextFloat();
        for (float kid : kids) {
            System.out.println(kid >= minHeight ? "SI" : "NO");
        }
    }
}
