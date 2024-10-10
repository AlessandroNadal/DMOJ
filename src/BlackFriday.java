import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int amount = scanner.nextInt();
            float add = scanner.nextFloat();

            if (amount == 0) {
                break;
            }

            for (int i = 0; i < amount; i++) {
                String name = scanner.next();
                float price = scanner.nextFloat();
                System.out.println(name + " " + (price + price * add / 100));
            }
        }
    }
}
