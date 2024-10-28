import java.util.Scanner;

public class UnCavallContraDosPeons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kX = scanner.nextInt();
        int kY = scanner.nextInt();
        int p1X = scanner.nextInt();
        int p1Y = scanner.nextInt();
        int p2X = scanner.nextInt();
        int p2Y = scanner.nextInt();

        System.out.println(isAttacked(kX, kY, p1X, p1Y) + isAttacked(kX, kY, p2X, p2Y));
    }

    private static int isAttacked(int kX, int kY, int p2X, int p2Y) {
        int p2XD = Math.abs(kX - p2X);
        int p2YD = Math.abs(kY - p2Y);
        if ((p2XD == 1 && p2YD == 2) || (p2XD == 2 && p2YD == 1)) {
            return 1;
        }

        return 0;
    }
}
