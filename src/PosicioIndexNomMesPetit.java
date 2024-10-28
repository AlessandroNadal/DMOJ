import java.util.Scanner;

public class PosicioIndexNomMesPetit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] nums = new int[amount];
        for (int i = 0; i < amount; i++) {
            nums[i] = scanner.nextInt();
        }

        Integer lowest = null;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (lowest == null || n < lowest) {
                lowest = n;
                index = i;
            }
        }

        System.out.println("El nombre més petit és el " + lowest + " i es troba a la posició " + (index + 1));
    }
}
