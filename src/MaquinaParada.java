import java.util.Scanner;

public class MaquinaParada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int days = 0;
        int hours = 0;
        for (int i = 0; i < amount; i++) {
            int day = scanner.nextInt();
            int used = scanner.nextInt();

            if (day == used) continue;

            days++;
            hours += day - used;
        }

        System.out.println(days);
        System.out.println(hours);
    }
}
