import java.util.Scanner;

public class NumDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int to = scanner.nextInt();
        int n = 0;
        for (int i = 1; i <= to; i++) {
            if (to % i == 0) {
                n++;
            }
        }
        System.out.println(n);
    }
}
