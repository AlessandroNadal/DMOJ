import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MediaTruncada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Float> values = new ArrayList<>();
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            values.add(scanner.nextFloat());
        }

        values.remove(Collections.max(values));
        values.remove(Collections.min(values));

        float sum = 0;
        for (Float value : values) {
            sum += value;
        }

        System.out.println(Math.round(sum / values.size() * 100f) / 100f);
    }
}
