import java.util.Scanner;

public class TotsSenarsOCap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = (int) scanner.nextDouble();
        int n2 = (int) scanner.nextDouble();
        int n3 = (int) scanner.nextDouble();
        if (n1 != 1 && n1 != 2) System.out.println(n1 + " " + n2 + " " + n3);
        System.out.println(n1 % 2 != 0 && n2 % 2 != 0 && n3 % 2 != 0);
    }
}
