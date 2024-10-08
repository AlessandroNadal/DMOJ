import java.util.Scanner;

public class ExamensAprovats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        for (int i = 0; i < 3; i++) {
            amount += scanner.nextFloat() >= 5?1:0;
        }

        if (amount==0) {
            System.out.println("No s'ha aprovat cap examen.");
        } else if (amount==1) {
            System.out.println("S'ha aprovat un examen.");
        } else if (amount == 2) {
            System.out.println("S'han aprovat dos exàmens.");
        } else {
            System.out.println("S'han aprovat tots els exàmens.");
        }
    }
}
