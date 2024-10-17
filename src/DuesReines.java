import java.util.Scanner;

public class DuesReines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();

        System.out.println(ax == bx || ay == by || Math.abs(ax-bx) == Math.abs(ay-by));
    }
}
