import java.util.Scanner;

public class MaquinaVending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float balance = 0;
        int stock = scanner.nextInt();
        float price = scanner.nextFloat();


        while (true) {


            String operation = scanner.next();
            if (operation.equals("OFF")) break;

            if (balance != 0) {
                System.out.println("Balance:" + balance);
            } else {
                System.out.println("Insert coin");
            }
            if (operation.equals("INSERT")) {
                balance += scanner.nextFloat();
            } else if (operation.equals("EXPEND")) {
                if (stock <= 0) {
                    System.out.println("Product unavailable");
                    continue;
                }

                if (!(balance >= price)) {
                    System.out.println("Price:" + price);
                    continue;
                }
                stock--;
                balance -= price;
                System.out.println("Your water, thanks");
            } else if (operation.equals("REFUND")) {
                System.out.println("Refund:" + balance);
                balance = 0f;
            } else if (operation.equals("OFF")) {
                break;
            }
        }
    }
}
