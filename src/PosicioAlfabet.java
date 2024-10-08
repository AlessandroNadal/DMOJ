import java.util.Scanner;

public class PosicioAlfabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (char c : scanner.nextLine().toCharArray()) {
            if (c == ' ') {
                continue;
            }

            System.out.println(c-97);
        }
    }
}
