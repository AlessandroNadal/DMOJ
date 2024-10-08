import java.util.Scanner;

public class Punts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.print(".");
        }
    }
}
