import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SepararLletrasINumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        ArrayList<Character> nums = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            char c = scanner.next().charAt(0);
            if (c >= 48 && c <= 57) {
                nums.add(c);
            } else chars.add(c);
        }

        for (Character num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (Character c : chars) {
            System.out.print(c + " ");
        }
    }
}
