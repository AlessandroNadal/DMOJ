import java.util.Scanner;

public class HelloYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();

        System.out.println("Hola " + nom + "!");
    }
}
