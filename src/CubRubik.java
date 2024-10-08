import java.util.Scanner;

public class CubRubik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long N = n-2;
        System.out.println(n*n*n - N*N*N);
    }
}
