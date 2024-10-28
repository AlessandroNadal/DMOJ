import java.util.Scanner;
import java.util.stream.IntStream;

public class LlumsHabitacio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lighted = IntStream.range(0, 3).filter(n -> scanner.nextBoolean()).toArray().length;
        System.out.println(switch (lighted) {
            case 0 -> "No s'ha encès cap llum.";
            case 1 -> "Només hi ha un llum encès.";
            case 2, 3 -> "S'han encès " + (lighted == 2 ? "dues" : " totes les") + " llums.";
            default -> "";
        });
    }
}
