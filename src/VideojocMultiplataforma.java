import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class VideojocMultiplataforma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] availability = new boolean[6];
        for (int i = 0; i < 6; i++) {
            availability[i] = scanner.nextBoolean();
        }

        System.out.println("Disponibilitat per a PlayStation 4 / 4 Pro: " + (availability[0] ? "disponible" : "no disponible"));
        System.out.println("Disponibilitat per a PlayStation 5: " + (availability[1] ? "disponible" : "no disponible"));
        System.out.println("Disponibilitat per a Xbox One S / X: " + (availability[2] ? "disponible" : "no disponible"));
        System.out.println("Disponibilitat per a Xbox Series S / X: " + (availability[3] ? "disponible" : "no disponible"));
        System.out.println("Disponibilitat per a Nintendo Switch: " + (availability[4] ? "disponible" : "no disponible"));
        System.out.println("Disponibilitat per a PC: " + (availability[5] ? "disponible" : "no disponible"));
        System.out.println("El videojoc és multiplataforma: " + (IntStream.range(0, 6).allMatch(n -> availability[n]) ? "SI" : "NO"));
    }
}
