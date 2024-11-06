import java.util.Scanner;

public class CaixerAutomatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float saldo = 0f;
        String s;
        while (!(s = scanner.next()).equals("SORTIR")) {
            if (s.equals("CONSULTAR")) {
                System.out.printf(">> Saldo: %.2f\n", saldo);
                continue;
            }

            if (s.equals("INGRESSAR") || s.equals("RETIRAR")) {
                float n = scanner.nextFloat();
                if (s.equals("INGRESSAR")) {
                    saldo += n;
                    System.out.printf("Ingres realitzat: %.2f\n", n);
                } else {
                    if (n > saldo) {
                        System.out.println("Saldo insuficient");
                    } else {
                        saldo -= n;
                        System.out.printf("Retirar diners -> %.2f\n", n);
                    }
                }
                System.out.printf(">> Saldo: %.2f\n", saldo);
            } else {
                System.out.println("Operacio no valida");
            }
        }
    }
}
