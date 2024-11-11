import java.util.Scanner;

public class AvaluacioFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int e = scanner.nextInt();

        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int p3 = scanner.nextInt();

        int ef = scanner.nextInt();
        int th = scanner.nextInt();
        int fa = scanner.nextInt();

        System.out.println((e >= (float) t * 0.75 && fa < (float) th * 0.2 && p1 >= 5 && p2 >= 5 && p3 >= 5) || (ef >= 5 && fa < (float) th * 0.2) ? "Aprova" : "Suspen");
    }
}
