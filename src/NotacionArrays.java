import java.util.Scanner;

public class NotacionArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("int[] myArray = { ");
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.print(scanner.nextInt() + (amount != i + 1 ? "," : "") + " ");
        }
        System.out.println("};");
    }
}
