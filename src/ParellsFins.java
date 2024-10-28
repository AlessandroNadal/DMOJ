import java.util.Scanner;

public class ParellsFins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int to = scanner.nextInt();
        if (to > 100) {
            System.out.println("Nombre massa gran");
            return;
        }
        System.out.println("Nombres parells fins a " + to + ":");
        for (int i = 0; i <= to; i += 2) {
            System.out.print(i + " ");
        }
    }
}
