import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AmagaColumnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowAmount = scanner.nextInt();
        int columnAmount = scanner.nextInt();

        ArrayList<ArrayList<String>> table = new ArrayList<>();
        for (int i = 0; i < rowAmount; i++) {
            ArrayList<String> row = new ArrayList<>();
            for (int j = 0; j < columnAmount; j++) {
                row.add(scanner.next());
            }
            table.add(row);
        }

        int hiddenAmount = scanner.nextInt();
        ArrayList<Integer> hide = new ArrayList<>();
        for (int i = 0; i < hiddenAmount; i++) {
            hide.add(scanner.nextInt());
        }

        for (ArrayList<String> strings : table) {
            for (int i = 0; i < strings.size(); i++) {
                if (hide.contains(i+1)) {
                    continue;
                }

                System.out.printf("%-10s", strings.get(i));
            }
            System.out.println();
        }
    }
}
