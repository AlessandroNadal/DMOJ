import java.util.Scanner;

public class PiramideLlumins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int amount = 0;
        for (int i = 1; i <= rows; i++) {
            amount += 3*i;
        }

        System.out.println(amount);
    }
}
