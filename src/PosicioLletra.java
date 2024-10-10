import java.util.Scanner;

public class PosicioLletra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String c = scanner.next();

        int pos = text.indexOf(c)+1;
        System.out.println(pos==0 ? "NO":pos);
    }
}
