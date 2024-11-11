import java.util.Scanner;

public class CuentaPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  count = 0;
        String s;
        while (!(s=scanner.next()).equals("END")) {
            count++;
        }

        System.out.println(count);
    }
}
