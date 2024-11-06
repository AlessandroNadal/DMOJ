import java.util.Scanner;

public class AprovarElModul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        for (int i = 0; i < 3; i++) {
            int practiques = scanner.nextInt();
            int lliurades = scanner.nextInt();
            int notaExamen = scanner.nextInt();

            if (i == 0) {
                if (practiques * 0.75 >= lliurades && notaExamen >= 4) {
                    n++;
                } else if (practiques / 2 >= lliurades && notaExamen >= 5) {
                    n++;
                }
            } else if (i == 1) {
                if (practiques * 0.75 >= lliurades && notaExamen >= 4) {
                    n++;
                } else if (practiques == lliurades) {
                    n++;
                } else if (lliurades / 2 == practiques && notaExamen >= 5) {
                    n++;
                }
            } else {
                if (practiques == lliurades && notaExamen >= 5) {
                    n++;
                }
            }
            System.out.println(n);
        }
        System.out.println(n == 3);
    }
}
