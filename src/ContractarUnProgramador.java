import java.util.Scanner;

public class ContractarUnProgramador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                (scanner.nextBoolean() & scanner.nextInt() >= 1)
                        || (scanner.nextBoolean()
                        & scanner.nextInt() >= 3)
        );
    }
}
