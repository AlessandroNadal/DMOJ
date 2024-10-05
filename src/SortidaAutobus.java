import java.util.Scanner;

public class SortidaAutobus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busA = scanner.nextInt();
        int busB = scanner.nextInt();
        int capacity = scanner.nextInt();

        System.out.println((busA + busB) * capacity);
    }
}
