import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i >= b; i--) {
            String s = "";
            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz";

            System.out.println(s.isEmpty() ? i : s);
        }
    }
}
