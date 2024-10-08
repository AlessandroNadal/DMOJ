import javax.swing.text.html.CSS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Product {
    int id;
    int merchant_id;
    String name;
    float price;

    Product(int id, int merchant_id, String name, float price) {
        this.id = id;
        this.merchant_id = merchant_id;
        this.name = name;
        this.price = price;
    }
}

class Merchant {
    int id;
    String name;

    Merchant(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Join {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productAmount = scanner.nextInt();
        ArrayList<Product> products = new ArrayList<>(productAmount);
        for (int i = 0; i < productAmount; i++) {
            int id = scanner.nextInt();
            products.add(
                    new Product(
                            id,
                            scanner.nextInt(),
                            scanner.next(),
                            scanner.nextFloat()
                    ));
        }

        int merchantAmount = scanner.nextInt();
        HashMap<Integer, Merchant> merchants = new HashMap<>(merchantAmount);
        for (int i = 0; i < merchantAmount; i++) {
            int id = scanner.nextInt();
            String name = scanner.nextLine().strip();
            merchants.put(
                    id,
                    new Merchant(
                            id,
                            name
                    ));
        }
        System.out.println("name            |merchant        |price     \n" +
                "----------------+----------------+----------");
        int displayedAmount = 0;
        for (Product product : products) {
            Merchant merchant = merchants.get(product.merchant_id);
            if (merchant == null) {
                continue;
            }
            String price = String.format("%.2f", product.price);
            System.out.printf("%-16s|%-16s|%10s\n", product.name, merchant.name, price);
            displayedAmount++;
        }
        System.out.printf("(%d rows)", displayedAmount);
    }
}