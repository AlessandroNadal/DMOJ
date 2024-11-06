import java.util.Scanner;

public class CuentaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (scanner.nextInt() != 0) count++;

        System.out.println(count);
    }
}
