import java.util.Scanner;

public class ElsPetitsDavant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a <= b && b <= c);
    }
}
