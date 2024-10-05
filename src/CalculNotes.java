import java.util.Scanner;

public class CalculNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota = scanner.nextFloat();
        if (nota == 10) {
            System.out.println("MATRICULA");
        } else if (nota >= 8.5) {
            System.out.println("EXCEL.LENT");
        } else if (nota >= 7) {
            System.out.println("NOTABLE");
        } else if (nota >= 6) {
            System.out.println("BE");
        } else if (nota >= 5) {
            System.out.println("SUFICIENT");
        } else {
            System.out.println("INSUFICIENT");
        }
    }
}
