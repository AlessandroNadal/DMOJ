import java.util.Scanner;

public class BigBen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println((n2 + n1) % 12);
    }
}
