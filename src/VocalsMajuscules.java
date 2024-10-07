import java.util.Scanner;

public class VocalsMajuscules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        String line;
        String vocals = "aeiou";

        while (!(line=scanner.nextLine()).equals("END")) {
            for (char c : line.toCharArray()) {
                String s = String.valueOf(c);
                if (vocals.contains(s)) {
                    string.append(s.toUpperCase());
                } else {
                    string.append(s);
                }
            }
            string.append("\n");
        }
        System.out.println(string);
    }
}
