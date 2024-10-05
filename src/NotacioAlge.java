import java.util.Scanner;

public class NotacioAlge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int column = scanner.nextInt();
        int row = scanner.nextInt();
        System.out.print(Character.toChars(column + 96)[0]);
        System.out.println(row);
    }
}
