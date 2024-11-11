import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClauAcces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> nums = Arrays.stream(IntStream.range(0, scanner.nextInt()).map(n -> scanner.nextInt()).toArray()).boxed().collect(Collectors.toCollection(ArrayList::new));
        System.out.println(IntStream.range(0, scanner.nextInt()).map(n -> scanner.nextInt()).filter(nums::contains).toArray().length == nums.size() ? "OK" : "ERROR");
    }
}
