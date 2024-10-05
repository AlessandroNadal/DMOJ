import java.util.Scanner;

public class TempsDeDescarrega {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int downloadSpeed = scanner.nextInt();
        int fileSize = scanner.nextInt() * 1024;

        System.out.println(fileSize / downloadSpeed);
    }
}
