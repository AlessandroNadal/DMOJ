import java.util.Scanner;

public class ExtraccioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int sum = 0;
        for (int i = 1; i < text.length(); i+=2) {
            sum += text.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
