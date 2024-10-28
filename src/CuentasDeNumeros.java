import java.util.Scanner;

public class CuentasDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        if (amount == 0) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < amount; i++) {
            int count = 0;
            int n;
            while ((n=scanner.nextInt())!=0) {
                count++;
            }

            System.out.println(count);
        }
    }
}
