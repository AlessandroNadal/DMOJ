import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FusionarLletresINumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        String[] l1 = new String[size1];
        for (int i = 0; i < size1; i++) {
            l1[i] = scanner.next();
        }

        int size2 = scanner.nextInt();
        String[] l2 = new String[size2];
        for (int i = 0; i < size2; i++) {
            l2[i] = scanner.next();
        }

        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> letters = new ArrayList<>();

        for (int i = 0; i < Math.max(size1, size2); i++) {
            if (i < size1) {
                if (l1[i].charAt(0) <= 57) {
                    numbers.add(l1[i]);
                } else {
                    letters.add(l1[i]);
                }
            }

            if (i < size2) {
                if (l2[i].charAt(0) <= 57) {
                    numbers.add(l2[i]);
                } else {
                    letters.add(l2[i]);
                }
            }
        }

        for (int i = 0; i < Math.max(numbers.size(), letters.size()); i++) {
            if (i < numbers.size()) {
                System.out.print(numbers.get(i) + " ");
            }

            if (i < letters.size()) {
                System.out.print(letters.get(i) + " ");
            }
        }
    }
}
