import java.util.Scanner;

public class SamusDispara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int width = scanner.nextInt();

        String[][] board = new String[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = scanner.next();
            }
        }

        String direction = scanner.next();
        String object = "";
        if (direction.equals("↑")) {
            for (int i = height - 1; i >= 0; i--) {
                object = board[i][0];
            }
        } else {
            for (int i = 0; i < width; i++) {
                object = board[board.length - 1][i];
            }
        }
        if (object.equals("#") || object.equals("&")) {
            System.out.printf(
                    "La Samus ha disparat en línia recta cap %s i ha impactat amb un %s.",
                    direction.equals("↑") ? "amunt" : "a la dreta",
                    object.equals("#") ? "objecte" : "enemic"
            );
        }else {
            System.out.printf("La Samus ha disparat en línia recta cap %s i no ha impactat amb res.",direction.equals("↑") ? "amunt" : "a la dreta" );
        }
    }
}
