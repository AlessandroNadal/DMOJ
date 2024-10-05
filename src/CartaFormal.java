import java.util.Scanner;

public class CartaFormal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tractament = scanner.nextLine();
        String nom = scanner.nextLine();
        String cognom1 = scanner.nextLine();
        String cognom2 = scanner.nextLine();

        System.out.printf("%s %s %s, %s\n" +
                "\n" +
                "El principal objectiu de la present carta...",
                tractament, cognom1, cognom2, nom);
    }
}
