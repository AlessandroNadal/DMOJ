import java.util.Scanner;

public class IgualAlUltimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            int n;
            int first = -1;
            int last = -1;
            while ((n=scanner.nextInt()) != 0) {
                if (first == -1) {
                    first = n;
                }
                last = n;
            }
            System.out.println(first == last ? "SI" : "NO");
        }
    }
}
