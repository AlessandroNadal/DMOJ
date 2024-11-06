import java.util.Scanner;

public class TrobantMines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        // TODO: Foo
        if (width == 5 && height == 5) System.out.println("ASD");
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (scanner.nextInt() == 1) {
                    System.out.printf("%d %d\n", y + 1, x + 1);
                }
            }
        }
    }
}
