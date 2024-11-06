import java.util.Scanner;

public class MoureUnRobot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        String s;
        while (!(s=scanner.next()).equals("STOP")) {
            int n = scanner.nextInt();

            switch (s) {
                case "DRETA" -> x+=n;
                case "ESQUERRA" -> x-=n;
                case "PUJA" -> y+=n;
                case "BAIXA" -> y-=n;
            }
        }

        System.out.printf("%d %d", x, y);
    }
}
