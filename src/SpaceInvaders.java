import java.util.Scanner;

public class SpaceInvaders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int aw = scanner.nextInt();
        int ah = scanner.nextInt();

        int bx = scanner.nextInt();
        int by = scanner.nextInt();
        int bw = scanner.nextInt();
        int bh = scanner.nextInt();

        System.out.println(ax < bx + bw && ax + aw > bx && ay < by + bh && ay + ah > by);
    }
}
