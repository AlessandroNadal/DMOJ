import java.util.ArrayList;
import java.util.Scanner;

public class OrdenCola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        ArrayList<Integer> people = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            people.add(scanner.nextInt());
        }

        boolean inorder = true;
        for (int i = 0; i < people.size(); i++) {
            int count = 0;
            for (int j = i+1; j < people.size(); j++) {
                if (people.get(i) > people.get(j)) {
                    count++;
                }
            }
            if (count>0) {
                System.out.printf("La persona con el ticket %d se ha colado por delante de %d personas.\n", people.get(i), count);
                inorder = false;
            }
        }

        if (inorder) {
            System.out.println("COLA EN ORDEN");
        }
    }
}
