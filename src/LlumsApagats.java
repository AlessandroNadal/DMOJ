import java.util.Scanner;
import java.util.stream.IntStream;

public class LlumsApagats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(IntStream.range(0, 4).allMatch(n -> !scanner.nextBoolean()));
    }
}
