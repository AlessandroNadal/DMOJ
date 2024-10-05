import java.util.Scanner;

public class Paella {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int comensals = scanner.nextInt();
        float preuArros = scanner.nextFloat();
        float preuGambes = scanner.nextFloat();
        float arrosKg = comensals / 4f * 0.5f;
        float gambesKg = comensals / 4f * 0.25f;
        preuArros = arrosKg * preuArros;
        preuGambes = gambesKg * preuGambes;

        System.out.println(arrosKg + " kg arros");
        System.out.println(gambesKg + " kg arros");
        System.out.println(preuArros + " euros arros");
        System.out.println(preuGambes + " euros gambes");
        System.out.println("TOTAL: " + (preuArros + preuGambes) + " euros");
    }
}
