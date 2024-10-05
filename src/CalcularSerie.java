import java.util.Scanner;

public class CalcularSerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int sum = 0;
        StringBuilder text = new StringBuilder();

        for (int i = 1; i <= amount; i++) {
            sum += i;
            if (i == 1) {
                text.append(i);
            } else {
                text.append("+" + i);
            }
            System.out.println(text + " = " + sum);
        }
    }
}
