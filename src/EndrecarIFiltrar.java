import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EndrecarIFiltrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = IntStream.range(0, scanner.nextInt()).map(n -> scanner.nextInt()).toArray();
        int n = scanner.nextInt();
        Arrays.stream(arr).filter(i -> i != n).sorted().forEach(i -> System.out.print(i + " "));
    }
}
