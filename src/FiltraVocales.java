import java.util.Scanner;

public class FiltraVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < amount; i++) {
            String s = scanner.next();
            if (vowels.contains(s)) {
                System.out.println(s);
            }
        }
    }
}
