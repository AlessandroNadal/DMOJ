import java.util.Scanner;

public class FullDeNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            float sum = 0;
            for (int j = 0; j < width; j++) {
                int n = scanner.nextInt();
                sum += n;
                System.out.print(n + " ");
            }
            System.out.println(sum / width);
        }
    }
}
