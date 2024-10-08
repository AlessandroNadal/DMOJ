import java.util.Scanner;

public class StigidSerT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();
        String newNumber = String.valueOf(number.charAt(2)) + number.charAt(1) + number.charAt(0);
        System.out.println(Integer.valueOf(newNumber));
    }
}
