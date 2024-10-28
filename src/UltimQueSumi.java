import java.util.Scanner;

public class UltimQueSumi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] numbers = new int[amount];
        for (int i = 0; i < amount; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + numbers[numbers.length-1] + " ");
        }
    }
}
