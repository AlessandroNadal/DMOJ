import java.util.Scanner;

public class BuscarLletras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().toCharArray()[0];
        String text = scanner.nextLine();

        int count = 0;
        for (char letter : text.toCharArray()) {
            if (letter == c) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
