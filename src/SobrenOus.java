import java.util.Scanner;

public class SobrenOus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float ous = scanner.nextFloat();
        int oueres = (int) Math.ceil(ous / 24);
        System.out.println(oueres + " " + ((int) (24 * oueres - ous)));
    }
}
