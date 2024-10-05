import java.util.Scanner;

public class PosicioDunaLletra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char find = scanner.next().charAt(0);

        int amount = 0;
        for (char c : text.toCharArray()) {
            if (c == find) {
                amount++;
            }
        }

        System.out.println(amount == 0 ? "NO" : amount);
    }
}
