import java.util.Arrays;
import java.util.Scanner;

public class ControlDeQualitat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] status = new String[5];
        for (int i = 0; i < 5; i++) {
            status[i] = scanner.nextBoolean() ? "correcte" : "defectuos";
        }

        System.out.printf("L'estat del txasis es: %s\n" +
                "L'estat de les rodes es: %s\n" +
                "L'estat del motor es: %s\n" +
                "L'estat de l'electronica es: %s\n" +
                "L'estat del llums es: %s\n" +
                "L'estat general del cotxe es: %s", status[0], status[1], status[2], status[3], status[4], Arrays.stream(status).allMatch(s -> s.equals("correcte")) ? "correcte" :" defectuos");
    }
}
