import java.util.Scanner;

public class AprovaONo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            String name = scanner.next();
            String lastname = scanner.next();
            float mark = scanner.nextFloat();

            System.out.println(name + " " + lastname + ": " + (mark >= 5.0 ? "aprova" : "suspèn"));
        }

    }
}
