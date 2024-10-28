import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Diccionari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        String s;
        while (!(s=scanner.next()).equals("__END__")) {
            words.add(s);
        }

        System.out.println("""
                class Dictionari {
                    String[] words = {""");

        for (int i = 0; i < words.size(); i++) {
            System.out.printf("        \"%s\"%s\n", words.get(i), words.size() == i+1 ? "" : ",");
        }

        System.out.println("""
                    };
                }""");
    }
}
