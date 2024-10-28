import java.util.Scanner;

public class PrimeroIgualAlUltimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int last = first;

        int n;
        while ((n = scanner.nextInt()) != 0) {
            last = n;
        }

        System.out.println(first == last ? "SI" : "NO");
    }
}
