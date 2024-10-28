import java.util.Scanner;

public class SumaSequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n;
        while (!(n=scanner.next()).equals("0")) {
            int amount = 0;
            for (char c : n.toCharArray()) {
                amount += c-48;
            }
            System.out.println(amount);
        }
    }
}
