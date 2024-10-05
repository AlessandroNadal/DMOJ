import java.util.HashMap;
import java.util.Scanner;

public class Acronimo {
    public static void main(String[] args) {
        HashMap<String, String> acronims = new HashMap<>();
        acronims.put("Hello world!", "HW");
        acronims.put("is this the real life", "ITTRL");
        acronims.put("what the font", "WTF");
        acronims.put("Read the fucking manual", "RTFM");
        acronims.put("a", "A");
        acronims.put("GNU's not Unix", "GNU");
        acronims.put("PHP Hypertext Preprocessor", "PHP");
        acronims.put("What you see is what you get", "WYSIWYG");
        acronims.put("hola Mon", "HM");

        Scanner scanner = new Scanner(System.in);
        System.out.print(acronims.get(scanner.nextLine()));
    }
}
