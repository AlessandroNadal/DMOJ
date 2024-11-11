import java.util.Scanner;
import java.util.stream.IntStream;

public class ThreeCardPoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cards = IntStream.range(0, 3).map(n -> scanner.nextInt()).sorted().toArray();

        if (cards[0] == cards[1] && cards[1] == cards[2]) {
            System.out.println("THREE OF A KIND");
        } else if ((cards[0] == cards[1]-1 && cards[0] == cards[2]-2) || (cards[0] == cards[1]+1 && cards[0] == cards[2]+2)) {
            System.out.println("STRAIGHT");
        } else if (cards[0] == cards[1] || cards[1] == cards[2] || cards[0] == cards[2]) {
            System.out.println("PAIR");
        } else {
            System.out.println("HIGH CARD");
        }
    }
}
