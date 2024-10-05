import java.util.Scanner;

public class VendaLlibres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sells = scanner.next().chars().map(x -> x - 48).toArray();
        int friday = sells[0];
        int saturday = sells[1];
        int sunday = sells[2];

        System.out.println("La quantitat total de llibres venuts és: " + (friday+saturday+sunday));
        String maxSells = friday > saturday ? "Divendres" : "Dissabte";
        maxSells = sunday >= Math.max(friday, saturday) ? "Diumenge" : maxSells;
        System.out.println("El dia amb més ventes ha sigut: " + maxSells);
    }
}
