import java.util.Scanner;

public class DesglossamentMonedes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        int[] coinValues = {500, 100, 50, 5, 1};
        int[] coins = {0, 0, 0, 0, 0};

        while (amount > 0) {
            for (int i = 0; i < coinValues.length; i++) {
                int coinValue = coinValues[i];
                if (amount >= coinValue) {
                    amount -= coinValue;
                    coins[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            if (coin == 0) continue;

            int coinValue = coinValues[i];
            System.out.println(coin + " " + (coin == 1 ? "moneda" : "monedes") + " de " + coinValue);
        }
    }
}
