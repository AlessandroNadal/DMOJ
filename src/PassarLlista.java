import java.util.ArrayList;
import java.util.Scanner;

public class PassarLlista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        ArrayList<String> llista = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            llista.add(scanner.next());
        }

        String s;
        while (!(s = scanner.next()).equals("__FI__")) {
            int index = llista.indexOf(s);
            System.out.println(index != -1 ? index+1 : "NO");
        }
    }
}
