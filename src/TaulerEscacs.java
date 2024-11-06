import java.util.Scanner;

public class TaulerEscacs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        System.out.print("|");
        for (int i = 0; i < size * 8; i++) {
            System.out.print("-");
        }
        System.out.println("|");

        for (int i = 0; i < 8; i++) {
            for (int n = 0; n < size; n++) {
                System.out.print("|");
                for (int j = 0; j < 8; j++) {
                    for (int k = 0; k < size; k++) {
                        System.out.print(i % 2 != 0 ? j % 2 == 0 ? "#" : " " : j % 2 != 0 ? "#" : " ");
                    }
                }
                System.out.print("|");
                System.out.println();
            }
        }
        System.out.print("|");
        for (int i = 0; i < size * 8; i++) {
            System.out.print("-");
        }
        System.out.print("|");
    }
}
