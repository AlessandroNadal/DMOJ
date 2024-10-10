import java.util.Locale;
import java.util.Scanner;

class Persona {
    String nom;

    public void saludar() {
        System.out.println("Hola, em dic " + nom);
    }
}

public class PersonaSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        Persona unaPersona = new Persona();
        unaPersona.nom = scanner.next();
        unaPersona.saludar();

        Persona unaAltraPersona = new Persona();
        unaAltraPersona.nom = scanner.next();
        unaAltraPersona.saludar();
    }
}
