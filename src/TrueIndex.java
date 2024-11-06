import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class TrueIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        boolean[] array = new boolean[100];
        for (int i = 0; i < 100; i++) {
            array[i] = false;
        }

        int index = scanner.nextInt();
        while (index != -1) {
            // assigna el valor 'true' a l'element de l'array en la posicio 'index'
            array[index] = true;

            index = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
    }
}
