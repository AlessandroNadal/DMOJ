import java.util.Scanner;

public class HoraApertura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(switch (scanner.next()) {
            case "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres" -> "8:00";
            case "Dissabte", "Diumenge" -> "10:00";
            default -> "asd";
        });
    }
}
