import java.util.ArrayList;
import java.util.Scanner;

public class Subsequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthA = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < lengthA; i++) {
            a.add(scanner.nextInt());
        }

        int lengthB = scanner.nextInt();
        ArrayList<Integer> b = new ArrayList<>(lengthA);
        for (int i = 0; i < lengthB; i++) {
            b.add(scanner.nextInt());

            if (b.size() > a.size()) {
                b.removeFirst();
            }

            if (a.equals(b)) {
                System.out.println("SI");
                return;
            }
        }

        System.out.println("NO");
    }
}
