import java.util.Scanner;

public class Encistellaments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] baskets = {0, 0, 0};
        int last = -1;
        int n;
        while ((n=scanner.nextInt())!=-1) {
            if (last == -1) {
                baskets[n-1] = 1;
            } else {
                int value = n-last;
                baskets[value-1]++;
            }

            last = n;
        }
        for (int basket : baskets) {
            System.out.println(basket);
        }
    }
}
