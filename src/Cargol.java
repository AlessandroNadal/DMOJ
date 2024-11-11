import java.util.Scanner;

public class Cargol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int pos = 0;
        int day = 1;
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (true) {
            pos += a;
            if (pos >= h) {
                System.out.println(day);
                return;
            }

            pos -= b;

            day++;
        }
    }
}
