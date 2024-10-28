import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilàter");
        } else if (a != b && a != c && b != c) {
            System.out.println("Escalè");
        } else {
            System.out.println("Isòsceles");
        }
    }
}
