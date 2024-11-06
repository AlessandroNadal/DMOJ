import java.util.Scanner;

public class ProvaMecanografica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float chars = scanner.nextFloat();
        float errors = scanner.nextFloat();
        float seconds = scanner.nextFloat();

        System.out.println((int) (100 * (chars - errors) / chars));
        System.out.println((int) (chars / 5 * 60 / seconds));
    }
}
