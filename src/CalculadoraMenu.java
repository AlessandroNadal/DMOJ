import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int op = scanner.nextInt();

        int result = switch (op) {
            case 1 -> a+b;
            case 2 -> a-b;
            case 3 -> a*b;
            case 4 -> a/b;
            default -> 0;
        };
        System.out.println("MENU:\n" +
                "1.-SUMAR\n" +
                "2.-RESTAR\n" +
                "3.-MULTIPLICAR\n" +
                "4.-DIVIDIR\n" +
                "Esculli una opcio:");
        System.out.println(result);
    }
}
