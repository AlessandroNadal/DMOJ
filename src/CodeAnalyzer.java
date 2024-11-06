import java.util.Scanner;

public class CodeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        String s;
        while (!(s=scanner.nextLine()).equals("END")) {
            for (String string : s.split(" ")) {
                if (string.equals("class")) count++;
            }
        }

        System.out.println(count);
    }
}
