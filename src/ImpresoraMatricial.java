import java.util.Scanner;

public class ImpresoraMatricial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while ((n=scanner.nextInt())!=-2) {
            if (n == -1) {
                System.out.println();
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(" ");
                }
                System.out.print("#");
            }
        }
    }
}
