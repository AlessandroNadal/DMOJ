import java.util.Scanner;

public class NotaMitjana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();

        System.out.println((n1 + n2 + n3) / 3f);
    }
}
