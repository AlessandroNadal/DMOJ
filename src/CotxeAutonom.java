import java.util.Scanner;

public class CotxeAutonom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        boolean v = scanner.nextBoolean();
        int a = scanner.nextInt();

        if (s.equals("r") && !v && a == 1) {
            System.out.println("CONTINUAR");
        } else if (!s.equals("r") && !v && a != 2) {
            System.out.println("CONTINUAR");
        }  else {
            System.out.println("NO CONTINUAR");
        }
    }
}
