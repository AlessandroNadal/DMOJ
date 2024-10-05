import java.util.Scanner;

public class StigidSerT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();
        String reversed = "";
        for (int i = number.length()-1; i >= 0; i--) {
            reversed += number.charAt(i);
        }
        System.out.println(Integer.valueOf(reversed));
    }
}
