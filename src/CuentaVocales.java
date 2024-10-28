import java.util.Scanner;

public class CuentaVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] count = {0, 0, 0, 0, 0};
        String vowels = "aeiou";
        for (char c : scanner.nextLine().toLowerCase().toCharArray()) {
            int index = vowels.indexOf(c);
            if (index != -1) {
                count[index]++;
            }
        }

        for (int i : count) {
            System.out.println(i);
        }
    }
}
