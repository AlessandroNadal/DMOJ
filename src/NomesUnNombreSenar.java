import java.util.Scanner;

public class NomesUnNombreSenar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        for (int i = 0; i < 3; i++) {
            if (scanner.nextInt() % 2 == 1) n++;
        }

        System.out.println(n == 1);
    }
}
