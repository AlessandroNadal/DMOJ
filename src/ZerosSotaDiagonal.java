import java.util.Scanner;

public class ZerosSotaDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                int n = scanner.nextInt();
                // System.out.print(n + " ");

                if (y > x) {
                    if (n != 0) {
                        System.out.println("NO");
                        return;
                    }
                }
            }
        }
        System.out.println("SI");
    }
}
