import java.util.Scanner;

public class ControlFerrioviari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Estat del semàfor (vermell, ambar, verd):");
        String estat = scanner.nextLine();

        System.out.println("Fre d'emergència? (true, false):");
        boolean fre = scanner.nextBoolean();

        System.out.println("Ordres del centre de control (0, 1, 2):");
        int ordre = scanner.nextInt();

        System.out.println(!estat.equals("vermell") && !fre && ordre == 0 ? "El tren pot continuar" : "El tren s'ha d'aturar!!");
    }
}
