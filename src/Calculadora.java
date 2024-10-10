import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n = 0f;
        int count = 0;
        while (true) {
            String operator = scanner.next();
            if (operator.equals("END")) break;
            count++;

            float num = scanner.nextFloat();
            switch (operator) {
                case "+":
                    n += num;
                    break;
                case "-":
                    n -= num;
                    break;
                case "*":
                    n *= num;
                    break;
                case "/":
                    n /= num;
            }
            System.out.println(n);
        }
        if (count == 0) {
            System.out.println(n);
        }
    }
}
