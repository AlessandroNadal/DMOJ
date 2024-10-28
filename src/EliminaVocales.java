import java.util.Scanner;

public class EliminaVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String vowels = "aeiouAEIOU";
        for (char c : line.toCharArray()) {
            if (vowels.indexOf(c)==-1) System.out.print(c);
        }
    }
}
