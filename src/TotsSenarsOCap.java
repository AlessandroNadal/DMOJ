import java.util.Scanner;

public class TotsSenarsOCap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println((n1 % 2 == 0 && n2 % 2 == 0 && n3 % 2 == 0) || (n1 % 2 == 1 && n2 % 2 == 1 && n3 % 2 == 1));
    }
}
