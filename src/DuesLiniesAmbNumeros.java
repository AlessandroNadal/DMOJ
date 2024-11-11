import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DuesLiniesAmbNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();
        Arrays.stream(scanner.nextLine().split(" ")).forEach(n -> a.add(Integer.parseInt(n)));

        ArrayList<Integer> b = new ArrayList<>();
        Arrays.stream(scanner.nextLine().split(" ")).forEach(n -> b.add(Integer.parseInt(n)));

        int n = scanner.nextInt();
        System.out.printf("La suma dels números en la posició %d retorna un nombre %s.\n", n, (a.get(n) + b.get(n)) % 2 == 0 ? "parell" : "senar");

        boolean allEqual = IntStream.range(0, a.size()).allMatch(j -> a.get(j).equals(b.get(j)));
        System.out.printf("%s són els mateixos.", allEqual ? "Tots el números" : "Els números no");
    }
}
