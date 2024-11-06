import java.util.Scanner;

public class LlistaEspera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        String[] llista = new String[amount];
        for (int i = 0; i < amount; i++) {
            llista[i] = scanner.next();

            int count = 0;
            for (int j = 0; j < i; j++) {
                if (llista[j].equals(llista[i])) count++;
            }

            System.out.print(count + " ");
        }


    }
}
