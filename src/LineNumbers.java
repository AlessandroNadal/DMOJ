import java.util.Scanner;

public class LineNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s;
        int n = 1;
        while (!(s=scanner.nextLine()).equals("END")) {
            System.out.printf("%d | %s\n", n, s);
            n++;
        }
    }
}
