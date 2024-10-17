import java.util.Scanner;

public class JustAnella {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int minDistance = scanner.nextInt();
        int maxDistance = scanner.nextInt();

        int dartX = scanner.nextInt();
        int dartY = scanner.nextInt();

        int dx = dartX - x;
        int dy = dartY - y;

        double distance = Math.sqrt(dx*dx + dy*dy);

        System.out.println(distance >= minDistance && distance <= maxDistance);
    }
}
