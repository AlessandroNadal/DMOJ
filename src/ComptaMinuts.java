import java.util.Scanner;

public class ComptaMinuts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hores = scanner.nextInt();
        int minuts = scanner.nextInt();

        System.out.println((24 * 60) - (hores * 60 + minuts));
    }
}
