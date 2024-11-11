import java.util.Scanner;

public class LongitudDeParaulesMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        String max = "";
        String min = "";
        int sum = 0;
        float count = 0;

        for (int i = 0; i < amount; i++) {
            String s = scanner.next();
            if (s.length() > max.length()) max = s;
            if (min.isEmpty() || s.length() < min.length()) {
                min = s;
            }

            sum += s.length();
            count++;
        }

        System.out.println("Paraula més curta: " + min);
        System.out.println("Paraula més llarga: " + max);
        System.out.println("Mitjana de lletres: " + (sum/count));
    }
}
