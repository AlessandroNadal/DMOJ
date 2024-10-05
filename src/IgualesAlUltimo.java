import java.util.ArrayList;
import java.util.Scanner;

public class IgualesAlUltimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            values.add(scanner.nextInt());
        }

        int n = 0;
        int lastValue = values.get(values.size() - 1);
        for (int i = 0; i < values.size()-1; i++) {
            if (values.get(i) == lastValue) {
                n++;
            }
        }

        System.out.println(n);
    }
}
