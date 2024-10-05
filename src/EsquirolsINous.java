import java.util.Scanner;

public class EsquirolsINous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int esquirols = scanner.nextInt();
        int nous = scanner.nextInt();
        System.out.println(nous % esquirols);
    }
}
