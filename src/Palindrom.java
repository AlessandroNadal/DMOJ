import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
