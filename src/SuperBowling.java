import java.util.Scanner;

public class SuperBowling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int i = 1;
        int pinAmount = 0;
        while (true) {
            pinAmount += i;

            i += 1;
            if (pinAmount < amount) {
                continue;
            } else if (pinAmount == amount) {
                System.out.println(true);
                break;
            } else {
                System.out.println(false);
                break;
            }
        }
    }
}
