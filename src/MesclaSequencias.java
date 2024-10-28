import java.util.Scanner;

public class MesclaSequencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s1 = scanner.nextInt();
        int[] l1 = new int[s1];
        for (int i = 0; i < s1; i++) {
            l1[i] = scanner.nextInt();
        }

        int s2 = scanner.nextInt();
        int[] l2 = new int[s2];
        for (int i = 0; i < s2; i++) {
            l2[i] = scanner.nextInt();
        }

        for (int i = 0; i < Math.max(l1.length, l2.length); i++) {
            if (i < l1.length) System.out.print(l1[i] + " ");
            if (i < l2.length) System.out.print(l2[i] + " ");
        }
    }
}
