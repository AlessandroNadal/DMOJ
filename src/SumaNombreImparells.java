import java.util.Scanner;

public class SumaNombreImparells {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int to = scanner.nextInt();
        if (to < 0) {
            System.out.println("Error: número invàlid");
            return;
        }

        int count = 0;
        for (int i = 1; i < to; i += 2) {
            count += i;
        }

        System.out.println("La suma dels números imparells fins a " + to + " és: " + count);
    }
}
