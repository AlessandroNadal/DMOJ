import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        String s = scanner.next();
        for (char c : s.toCharArray()) {
            n += c - 48;
        }

        System.out.println(n);
    }
}
