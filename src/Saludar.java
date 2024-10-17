import java.util.HashMap;
import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> translations = new HashMap<>();

        translations.put("French", "Bonjour");
        translations.put("Spanish", "Hola");
        translations.put("Russian", "Zdravstvuyte");
        translations.put("Chinese", "Nin hao");
        translations.put("Japanese", "Konnichiwa");
        translations.put("German", "Guten Tag");
        translations.put("Portuguese", "Ola");
        translations.put("Arabic", "Asalaam alaikum");
        translations.put("Hindi", "Namaste");
        translations.put("Romanian", "Buna ziua");

        String reply = translations.get(scanner.nextLine());
        if (reply == null) {
            System.out.println("No conec el teu idioma, com es diu hola?");
            System.out.println(scanner.nextLine());
            return;
        }

        System.out.println(reply);
    }
}
