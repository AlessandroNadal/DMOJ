import java.util.Scanner;

public class GraficosCalifica {
    public static void main(String[] args) {
        int excellent = 0;
        int notable = 0;
        int be = 0;
        int suficient = 0;
        int insuficient = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int nota = scanner.nextInt();
            if (nota == -1) {
                break;
            }

            if (nota >= 9) {
                excellent++;
            } else if (nota >= 7) {
                notable++;
            } else if (nota == 6) {
                be++;
            } else if (nota == 5) {
                suficient++;
            } else {
                insuficient++;
            }
        }
        imprimirNota("E", excellent);
        imprimirNota("N", notable);
        imprimirNota("B", be);
        imprimirNota("S", suficient);
        imprimirNota("I", insuficient);
    }

    public static void imprimirNota(String lletra, int quantitat) {
        System.out.print(lletra+":");
        for (int i = 0; i < quantitat; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
