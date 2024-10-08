import java.util.Scanner;

class ShoppingCartProduct {
    String name;
    float price;
}

class ShoppingCart {
    ShoppingCartProduct[] products;
}

public class ShoppingCartSolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingCart shoppingCart = new ShoppingCart();

        int nProducts = scanner.nextInt();
        scanner.nextLine();

        shoppingCart.products = new ShoppingCartProduct[nProducts];

        for (int i = 0; i < nProducts; i++) {
            shoppingCart.products[i] = new ShoppingCartProduct();
            shoppingCart.products[i].name = scanner.nextLine();
            shoppingCart.products[i].price = scanner.nextFloat();
            scanner.nextLine();
        }

        System.out.println("ShoppingCart");
        for (int i = 0; i < nProducts; i++) {
            System.out.format("%40s  %6.2f%n", shoppingCart.products[i].name, shoppingCart.products[i].price);
        }
    }
}
