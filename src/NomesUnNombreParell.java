import java.util.Scanner;

public class NomesUnNombreParell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (scanner.nextInt() % 2 == 0) count++;
        }

        System.out.println(count==1);
    }
}
