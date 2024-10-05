import java.util.Scanner;

public class Galib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float height = scanner.nextFloat();

        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            if (height > scanner.nextFloat()) {
                System.out.println("xoca amb el pont " + (i+1));
                break;
            }
        }
    }
}
