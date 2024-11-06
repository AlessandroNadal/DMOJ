import java.util.Scanner;

public class ContinuarAmbElCotxe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Estat del semafor (vermell, ambar, verd):\n" +
                "Persones creuant el carrer? (true, false):\n" +
                "Estat de l'agent de circulacio (0, 1, 2):");

        String light = scanner.next();
        boolean people = scanner.nextBoolean();
        int state = scanner.nextInt();

        boolean stop = false;
        if (!people) {
            if (light.equals("vermell")) {
                if (state == 1) stop = true;
            } else if (state < 2) stop = true;
        }

        System.out.println(!stop ? "El cotxe s'ha d'aturar!!" :  "El cotxe pot passar");
    }
}
