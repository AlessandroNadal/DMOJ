import java.util.ArrayList;
import java.util.Scanner;

public class CombinacionSecreta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> code = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            code.add(scanner.nextInt());
        }

        ArrayList<Integer> tried = new ArrayList<>(3);
        int n;
        while ((n=scanner.nextInt())!=-1) {
            tried.add(n);
            if (tried.size()>3) {
                tried.remove(0);
            }

            if (code.equals(tried)) {
                System.out.println("ABIERTA");
                return;
            }
        }

        System.out.println("CERRADA");
    }
}
