import java.util.Scanner;

public class PermietreRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();

        System.out.println(Math.abs(ax - bx) * 2 + Math.abs(ay - by) * 2);
    }
}
