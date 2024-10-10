import java.util.Scanner;

public class PrimerDecimalParell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = (int) ((scanner.nextFloat()%10) * 10);
        System.out.println(n%2==0);
    }
}
