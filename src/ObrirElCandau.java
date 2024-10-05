import java.util.Scanner;

public class ObrirElCandau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clau = scanner.nextInt();
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (comprovarCodi(n1, n2, n3, clau)) {
            System.out.println(true);
            return;
        }

        int n;
        while ((n = scanner.nextInt()) != -1) {
            n1 = n2;
            n2 = n3;
            n3 = n;

            if (comprovarCodi(n1, n2, n3, clau)) {
                System.out.println(true);
                return;
            }

        }
        System.out.println(false);
    }

    public static boolean comprovarCodi(int n1, int n2, int n3, int clau) {
        return (n1 + n2) * n3 == clau;
    }
}
