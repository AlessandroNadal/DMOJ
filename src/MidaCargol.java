import java.util.Scanner;

public class MidaCargol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if (size < 1 || size > 10) {
            System.out.println("mida incorrecta");
        } else if (size < 3) {
            System.out.println("petit");
        } else if (size < 5) {
            System.out.println("mitja");
        } else if (size < 8) {
            System.out.println("gran");
        } else {
            System.out.println("molt gran");
        }
    }
}
