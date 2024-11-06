import java.util.Scanner;

public class ContractarUnXef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nom = scanner.nextLine();
        String edad = scanner.nextLine();
        String estudis = scanner.nextLine();
        String anys = scanner.nextLine();
        String cuina = scanner.nextLine();

        System.out.printf("El formulari de %s s'ha completat. Et contactarem si necessitem un xef de cuina %s.", nom, cuina);
    }
}
