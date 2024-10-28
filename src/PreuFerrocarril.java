import java.text.DecimalFormat;
import java.util.Scanner;

public class PreuFerrocarril {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float distancia = scanner.nextFloat();
        int dies = scanner.nextInt();

        double preu = distancia * 0.35;
        if (distancia > 800 && dies > 7) {
            preu *= 0.7;
        }
        System.out.println(Float.valueOf(new DecimalFormat("0.000").format(preu)));
    }
}
