import java.util.Scanner;

public class MenjarsDunRestaurants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("MENU:\n" +
                "1.- ESMORZARS\n" +
                "2.- DINARS\n" +
                "3.- BERENARS\n" +
                "4.- SOPARS\n" +
                "\n");
        int opcio = scanner.nextInt();
        if (!(opcio >= 1 && opcio <= 4)) {
            System.out.println("OPCIO INEXISTENT !!");
            return;
        }

        System.out.printf("Total %s del restaurant A i B: %d", (
                switch (opcio) {
                    case 1 -> "ESMORZARS";
                    case 2 -> "DINARS";
                    case 3 -> "BERENARS";
                    case 4 -> "SOPARS";
                    default -> "";
                }), scanner.nextInt() + scanner.nextInt());
    }
}
