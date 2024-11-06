import java.util.Scanner;

public class Xirtam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print((scanner.nextInt() == 0 ? 1 : 0 )+ " ");
            }
            System.out.println();
        }
    }
}
