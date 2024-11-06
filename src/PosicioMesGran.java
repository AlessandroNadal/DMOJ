    import java.util.Scanner;

    public class PosicioMesGran {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int amount = scanner.nextInt();
            Integer max = null;
            int pos = 0;
            for (int i = 0; i < amount; i++) {
                int n = scanner.nextInt();
                if (max == null || n > max) {
                    max=n;
                    pos = i+1;
                }
            }

            System.out.printf("El nombre més gran és el %d i es troba a la posició %d", max, pos);
        }
    }
