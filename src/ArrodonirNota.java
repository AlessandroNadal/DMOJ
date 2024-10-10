import java.util.Scanner;

public class ArrodonirNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota = scanner.nextFloat();
        System.out.println(Math.round(nota));
    }
}
