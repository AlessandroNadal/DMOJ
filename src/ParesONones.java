import java.util.Scanner;

public class ParesONones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        int n = scanner.nextInt();
        String b = scanner.next();
        n += scanner.nextInt();

        System.out.println((a.equals("pares") && n % 2 == 0) || (a.equals("nones") && n % 2 != 0) ? "primer jugador" : "segon jugador");
    }
}
