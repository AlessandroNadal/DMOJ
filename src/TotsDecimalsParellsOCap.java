import java.util.Scanner;

public class TotsDecimalsParellsOCap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = (int) scanner.nextFloat();
        int b = (int) scanner.nextFloat();
        int c = (int) scanner.nextFloat();

        System.out.println(a % 2 == 0 && b % 2 == 0 && c % 2 == 0 || a % 2 != 0 && b % 2 != 0 && c % 2 != 0);
    }
}
