import java.util.Scanner;

public class Artropodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        amount += scanner.nextInt() * 6;
        amount += scanner.nextInt() * 8;
        amount += scanner.nextInt() * 10;
        amount += scanner.nextInt() * scanner.nextInt() * 2;
        amount += scanner.nextInt() * scanner.nextInt() * 4;

        System.out.println(amount);
    }
}
