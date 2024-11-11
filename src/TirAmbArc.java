import java.util.Scanner;

public class TirAmbArc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        if (d < 5) {
            System.out.println(5);
        } else if (d < 10) {
            System.out.println(4);
        } else if (d < 15) {
            System.out.println(3);
        } else if (d < 20) {
            System.out.println(2);
        } else if (d < 25) {
            System.out.println(1);
        }
    }
}
